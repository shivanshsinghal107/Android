package com.example.fourthpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sub=findViewById(R.id.btn);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getId()==R.id.btn) {

                    EditText t=findViewById(R.id.editText7);
                    String s=t.getText().toString();

                    Intent in = new Intent(MainActivity.this, Main2Activity.class);
                    in.putExtra("Name",s);
                    startActivity(in);
                }
            }
        });
    }
}
