package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageview;
    Button btnCalcular;
    EditText peso;
    EditText altura;
    TextView resul,classi;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=findViewById(R.id.imageView);
        btnCalcular=findViewById(R.id.button);
        peso=findViewById(R.id.etPeso);
        altura=findViewById(R.id.etAltura);

        btnCalcular.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), TelaResultado.class);
            String pesoStr = peso.getText().toString();
            String alturaStr = altura.getText().toString();

            i.putExtra("peso",pesoStr);
            i.putExtra("altura",alturaStr);
            startActivity(i);
        });
    }
}