package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

public class ChooseEndTimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_end_time);

        Button finishEnterEndTime = (Button) findViewById(R.id.finishEnterEndTime);
        finishEnterEndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ChooseEndTimeActivity.this, ChooseLocationActivity.class));
                DatePicker datePicker = (DatePicker) findViewById(R.id.endDatePicker);
                int sday = datePicker.getDayOfMonth();
                int smonth = datePicker.getMonth() + 1;
                int syear = datePicker.getYear();
                String x = new String(new StringBuilder().append(sday).append("/").append(smonth).append("/").append(syear));
                SharedPreferences.Editor editor = getSharedPreferences("yo", MODE_PRIVATE).edit();
                editor.putString("endDate", x);
                editor.apply();

            }
        });
    }
}
