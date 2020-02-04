package com.addfray.login;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {

 EditText Angka1, Angka2;
 Button btn1, btn2, btn3, btn4;
 TextView Hasil;
 Float Result;
 float angka1, angka2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        Angka1 = findViewById(R.id.angka1);
        Angka2 = findViewById(R.id.angka2);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        Hasil = findViewById(R.id.tv);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1=Float.parseFloat(Angka1.getText().toString());
                angka2=Float.parseFloat(Angka2.getText().toString());
                Result=angka1+angka2;
                Hasil.setText(Result+"");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1=Float.parseFloat(Angka1.getText().toString());
                angka2=Float.parseFloat(Angka2.getText().toString());
                Result=angka1-angka2;
                Hasil.setText(Result+"");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1=Float.parseFloat(Angka1.getText().toString());
                angka2=Float.parseFloat(Angka2.getText().toString());
                Result=angka1*angka2;
                Hasil.setText(Result+"");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                angka1=Float.parseFloat(Angka1.getText().toString());
                angka2=Float.parseFloat(Angka2.getText().toString());
                Result=angka1/angka2;
                Hasil.setText(Result+"");

            }
        });
    }
}
