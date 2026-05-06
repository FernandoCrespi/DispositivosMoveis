package com.example.meuapp;

import android.media.Image;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listview);
        //recuperar dados datasource
        PlanetaController pcontroller = new PlanetaController();

        AdapterPlaneta adaptador = new AdapterPlaneta(
                this,
                pcontroller.listaPlanetas();
        )
        lv.setAdapter(adaptador);


    }
}