package com.example.meuapp;

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
    EditText peso, altura;
    TextView resul,classi;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=findViewById(R.id.imageView);
        btnCalcular=findViewById(R.id.button);
        peso=findViewById(R.id.etPeso);
        altura=findViewById(R.id.etAltura);
        resul=findViewById(R.id.tvResul);
        classi=findViewById(R.id.tvClass);

    }
}