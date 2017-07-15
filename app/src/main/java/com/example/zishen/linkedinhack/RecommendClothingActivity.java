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
        EditText sText = (EditText) findViewById(R.id.startDate);

        EditText eText = (EditText) findViewById(R.id.endDate);

        sText.setText(prefs.getString("startDate", null));

        eText.setText(prefs.getString("endDate", null));


    }



}
