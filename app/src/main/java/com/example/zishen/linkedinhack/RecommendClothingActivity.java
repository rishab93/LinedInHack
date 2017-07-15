package com.example.zishen.linkedinhack;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class RecommendClothingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_clothing);

        SharedPreferences prefs = getSharedPreferences("yo", MODE_PRIVATE);
        TextView sText = (TextView) findViewById(R.id.startDate);

        TextView eText = (TextView) findViewById(R.id.endDate);

        sText.setText("Trip start date: " + prefs.getString("startDate", null));

        eText.setText("Trip end date: " + prefs.getString("endDate", null));


    }



}
