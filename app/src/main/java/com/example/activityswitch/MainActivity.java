package com.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        A = (ConstraintLayout)findViewById(R.id.A);
    }

    public void Switch(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }
}