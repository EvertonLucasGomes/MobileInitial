package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText inputGasolina;
    EditText inputAlcool;
    Button btnVerificar;
    TextView result;

    private static final  String TAG = "Ciclo_De_Vida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate executado.");

        inputAlcool = findViewById(R.id.inputAlcool);
        inputGasolina = findViewById(R.id.inputGasolina);
        btnVerificar = findViewById(R.id.btnVerificar);
        result = findViewById(R.id.result);


        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double precoAlcool = Double.parseDouble(inputAlcool.getText().toString());
                double precoGasolina = Double.parseDouble(inputGasolina.getText().toString());

                double razao = precoAlcool/precoGasolina;

                result.setText(String.format("Razão: %.2f", razao));

                Intent intent = new Intent(MainActivity.this, second.class);

                intent.putExtra("message_key", result.getText());

                startActivity(intent);


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.i(TAG, "onStart executado.");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(TAG, "onResume executado.");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i(TAG, "onPause executado.");

    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(TAG, "onStop executado.");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.i(TAG, "onRestart executado.");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(TAG, "onDestroy executado.");
    }
}