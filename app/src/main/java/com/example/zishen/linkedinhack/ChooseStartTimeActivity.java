package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class ChooseStartTimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_start_time);

        Button finishEnterStartTime = (Button) findViewById(R.id.finishEnterStartTime);
        finishEnterStartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseStartTimeActivity.this, ChooseEndTimeActivity.class));
                DatePicker datePicker = (DatePicker) findViewById(R.id.startDatePicker);
                int sday = datePicker.getDayOfMonth();
                int smonth = datePicker.getMonth() + 1;
                int syear = datePicker.getYear();
                String x = new String(new StringBuilder().append(sday).append("/").append(smonth).append("/").append(syear));
                SharedPreferences.Editor editor = getSharedPreferences("yo", MODE_PRIVATE).edit();
                editor.putString("startDate", x);
                editor.apply();

            }
        });

    }

}
