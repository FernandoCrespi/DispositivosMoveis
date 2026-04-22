package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaResultado extends AppCompatActivity {

    TextView resul, classi;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_resultado);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        resul=findViewById(R.id.tvResultado);
        classi=findViewById(R.id.tvClassificacao);
        img=findViewById(R.id.resulImg);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String alturaStr = b.getString("altura");
        String  pesoStr= b.getString("peso");

        float peso = Float.parseFloat(pesoStr);
        float altura = Float.parseFloat(alturaStr);
        float IMC = (peso / (altura * altura));

        resul.setText(String.format("IMC: %.2f", IMC));
        if (IMC < 18.5){
            classi.setText("Abaixo do Peso");
            img.setImageResource(R.drawable.abaixopeso);
        } else if (IMC >= 18.5 && IMC <= 24.9 ) {
            classi.setText("Peso Normal");
            img.setImageResource(R.drawable.normal);
        } else if (IMC >= 25 && IMC <= 29.9) {
            classi.setText("Sobrepeso");
            img.setImageResource(R.drawable.sobrepeso);
        } else if (IMC >= 30 && IMC <= 34.9) {
            classi.setText("Obesidade Grau 1");
            img.setImageResource(R.drawable.obesidade1);
        }else if (IMC >= 35 && IMC <= 39.9) {
            classi.setText("Obesidade Grau 2");
            img.setImageResource(R.drawable.obesidade2);
        }else {
            classi.setText("Obesidade Grau 3");
            img.setImageResource(R.drawable.obesidade3);
        }


    }
}