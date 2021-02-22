package com.example.chapter6activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNext(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText editMsg = findViewById(R.id.editMsg);
        String msg = editMsg.getText().toString();
        intent.putExtra("message",msg);
        startActivity(intent);
    }
}