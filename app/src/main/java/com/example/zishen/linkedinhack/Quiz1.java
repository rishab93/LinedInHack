package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Quiz1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz1);

        ImageView thumbUp = (ImageView) findViewById(R.id.thumbUp);
        thumbUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz1.this, Quiz2.class));
            }
        });

        ImageView thumbDown = (ImageView) findViewById(R.id.thumbDown);
        thumbDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz1.this, Quiz2.class));
            }
        });
    }

}
