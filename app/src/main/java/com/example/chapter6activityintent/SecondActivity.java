package com.example.chapter6activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textRec = findViewById(R.id.textRec);
        String message = getIntent().getStringExtra("message");
        textRec.setText(message);
    }
}