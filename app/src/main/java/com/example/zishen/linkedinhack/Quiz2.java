package com.example.zishen.linkedinhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class Quiz2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        ImageView thumbUp2 = (ImageView) findViewById(R.id.thumbUp2);
        thumbUp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz2.this, Quiz3.class));
            }
        });

        ImageView thumbDown2 = (ImageView) findViewById(R.id.thumbDown2);
        thumbDown2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Quiz2.this, Quiz3.class));
            }
        });
    }

}
