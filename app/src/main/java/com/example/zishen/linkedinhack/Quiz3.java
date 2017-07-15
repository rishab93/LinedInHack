package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Quiz3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        ImageView thumbUp3 = (ImageView) findViewById(R.id.thumbUp3);
        thumbUp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz3.this, ChooseStartTimeActivity.class));
            }
        });

        ImageView thumbDown3 = (ImageView) findViewById(R.id.thumbDown3);
        thumbDown3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz3.this, ChooseStartTimeActivity.class));
            }
        });
    }

}
