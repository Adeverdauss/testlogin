package com.addfray.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1, e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_click(View V)
    {
            e1 =(EditText) findViewById(R.id.editText1);
            e2 =(EditText) findViewById(R.id.editText2);

            String uname = e1.getText().toString();
            String pass  = e2.getText().toString();

            if (e1.getText().toString().isEmpty()|| e2.getText().toString().isEmpty()){
            Toast.makeText(MainActivity.this, "Harus Terisi Semua", Toast.LENGTH_SHORT).show();
    }else {
                if (uname.equals("Patrick") && pass.equals("hello")) {
                Toast.makeText(this, "Login Succesful", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, Kalkulator.class );
                i.putExtra("userName", uname);
                startActivity(i);
            }
            else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
            }

            }

    }
}
