package com.example.activityswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    private ConstraintLayout B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        B = (ConstraintLayout) findViewById(R.id.B);
    }
    public void Switch(View view) {
        MainActivity2.this.finish();
    }
}