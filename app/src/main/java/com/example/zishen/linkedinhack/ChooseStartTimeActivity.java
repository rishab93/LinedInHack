package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
            }
        });
    }

}
