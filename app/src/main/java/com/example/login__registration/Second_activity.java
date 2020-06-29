package com.example.login__registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);
        String s=getIntent().getStringExtra("mydata");
        TextView tv=findViewById(R.id.welcome);
        tv.setText("Welcome :"+s);
    }
}