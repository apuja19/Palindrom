package com.example.mobdev;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {

    EditText isinama;
    TextView showuser;
    String nama;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen);
        Intent intent = getIntent();
        if (intent.hasExtra("isinama")) {
            nama = intent.getStringExtra("isinama");
        }

        isinama = findViewById(R.id.isinama);
        showuser = findViewById(R.id.welcominguser);

        showuser.setText(nama);

    }
}
