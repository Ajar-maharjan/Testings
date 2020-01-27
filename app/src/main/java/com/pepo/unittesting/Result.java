package com.pepo.unittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvResult =  findViewById(R.id.tvResult);
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        if (result == null)
        {
            tvResult.setText("You sucks in coding OMEGALUL");
        }
        else {
            tvResult.setText(result);
        }

    }
}
