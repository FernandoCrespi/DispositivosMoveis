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
        resul=findViewById(R.id.tvResul);
        classi=findViewById(R.id.tvClass);

        btnCalcular.setOnClickListener(v -> {

            String pesoStr = peso.getText().toString();
            String alturaStr = altura.getText().toString();

            float valorPeso = Float.parseFloat(pesoStr);
            float valorAltura = Float.parseFloat(alturaStr);

            float IMC = (valorPeso / (valorAltura*valorAltura));
            resul.setText(String.format("IMC: %.2f", IMC));
            if (IMC < 18.5){
                classi.setText("Abaixo do Peso");
                imageview.setImageResource(R.drawable.abaixopeso);
            } else if (IMC >= 18.5 && IMC <= 24.9 ) {
                classi.setText("Peso Normal");
                imageview.setImageResource(R.drawable.normal);
            } else if (IMC >= 25 && IMC <= 29.9) {
                classi.setText("Sobrepeso");
                imageview.setImageResource(R.drawable.sobrepeso);
            } else if (IMC >= 30 && IMC <= 34.9) {
                classi.setText("Obesidade Grau 1");
                imageview.setImageResource(R.drawable.obesidade1);
            }else if (IMC >= 35 && IMC <= 39.9) {
                classi.setText("Obesidade Grau 2");
                imageview.setImageResource(R.drawable.obesidade2);
            }else {
                classi.setText("Obesidade Grau 3");
                imageview.setImageResource(R.drawable.obesidade3);
            }
        });
    }
}