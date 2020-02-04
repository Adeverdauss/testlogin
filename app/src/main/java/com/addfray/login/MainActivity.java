package com.addfray.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtusername;
    EditText txtpassword;
    Button btnlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtusername = findViewById(R.id.editText1);
        txtpassword = findViewById(R.id.editText2);
        btnlogin = findViewById(R.id.button);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (txtusername.getText().toString().isEmpty()|| txtpassword.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Harus Terisi Semua", Toast.LENGTH_SHORT).show();
                }else {
                    if (txtusername.getText().toString().equals("ade") && txtpassword.getText().toString().equals("ade")) {
                        Toast.makeText(MainActivity.this, "Login Succesful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, Kalkulator.class );
                        startActivity(i);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }




}
