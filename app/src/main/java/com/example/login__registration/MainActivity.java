package com.example.login__registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.uname);
        et2=findViewById(R.id.pass);
    }

    public void login(View view) {
        String data1=et1.getText().toString();
        String data2=et2.getText().toString();
        if (data1.isEmpty() || data2.isEmpty()){
            Toast.makeText(this, "pls enter details", Toast.LENGTH_SHORT).show();
        }
        else if ( data2.equals("password")){
            Intent i = new Intent(MainActivity.this, Second_activity.class);
            i.putExtra("mydata", data1);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "pls enter valid details", Toast.LENGTH_SHORT).show();
        }
    }

    public void register(View view) {
        Intent j = new Intent(MainActivity.this, Thirdactivity.class);
        startActivity(j);
    }
}