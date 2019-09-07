package com.example.fourthpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String user=getIntent().getStringExtra("Name");
        TextView tv=findViewById(R.id.editText7);
        tv.setText(user);
    }
}
