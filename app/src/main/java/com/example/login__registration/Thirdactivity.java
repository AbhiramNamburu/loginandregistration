package com.example.login__registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Thirdactivity extends AppCompatActivity {
    EditText et1,et2,et3,et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        et3=findViewById(R.id.editText3);
        et4=findViewById(R.id.editText4);
    }

    public void reset(View view) {
        String data1 = et1.getText().toString();
        String data2 = et2.getText().toString();
        String data3 = et3.getText().toString();
        String data4 = et4.getText().toString();
        if (data1.isEmpty() || data2.isEmpty() || data3.isEmpty() || data4.isEmpty()) {
            Toast.makeText(this, "pls enter details", Toast.LENGTH_SHORT).show();
        } else{
            Intent j = new Intent(Thirdactivity.this, MainActivity.class);
            startActivity(j);
        }
    }
}