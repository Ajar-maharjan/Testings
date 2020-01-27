package com.pepo.unittesting;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Testing extends AppCompatActivity {

    EditText etno1, etno2;
    Button btnAdd, btnSub, btnDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        etno1 = findViewById(R.id.etno1);
        etno2 = findViewById(R.id.etno2);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnDiv = findViewById(R.id.btnDiv);
        final Arithmetic arithmetic = new Arithmetic();


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(etno1.getText().toString());
                Float number2 = Float.parseFloat(etno2.getText().toString());
                Float add = arithmetic.add(number1,number2);
                Intent intent = new Intent(Testing.this, Result.class);
                intent.putExtra("result", add.toString());
                startActivity(intent);

            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(etno1.getText().toString());
                Float number2 = Float.parseFloat(etno2.getText().toString());
                Float sub = arithmetic.subtract(number1,number2);
                Intent intent = new Intent(Testing.this, Result.class);
                intent.putExtra("result", sub.toString());
                startActivity(intent);

            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Float number1 = Float.parseFloat(etno1.getText().toString());
                Float number2 = Float.parseFloat(etno2.getText().toString());
                Float div = arithmetic.divide(number1,number2);
                Intent intent = new Intent(Testing.this, Result.class);
                intent.putExtra("result", div.toString());
                startActivity(intent);

            }
        });
    }
}
