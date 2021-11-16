package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class second extends AppCompatActivity {
    TextView teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        teste = findViewById(R.id.teste);

        Intent intent = getIntent();

        String str = intent.getStringExtra("message_key");

        teste.setText(str);


    }
}