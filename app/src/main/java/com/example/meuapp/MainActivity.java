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

    Button bntAvancar, bntVoltar;
    ImageView imageView;

    Integer imagens[] = new Integer[]{
            R.drawable.cachorro,
            R.drawable.gardem,
            R.drawable.happy,
            R.drawable.patinho,
            R.drawable.porquinho
    };
    int posicao = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bntAvancar=findViewById(R.id.buttonAvancar);
        bntVoltar=findViewById(R.id.buttonVoltar);
        imageView=findViewById(R.id.imageView);
        imageView.setImageResource(imagens[posicao]);

        bntAvancar.setOnClickListener(v -> {
            if (posicao==imagens.length-1){
                posicao = 0;
            }else{
                posicao++;
            }
            imageView.setImageResource(imagens[posicao]);
        });

        bntVoltar.setOnClickListener(v -> {
            if (posicao < 1){
                posicao = 4;
            }else{
                posicao--;
            }imageView.setImageResource(imagens[posicao]);
        });
    }
}