package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        et = findViewById(R.id.editText);

        btn.setOnClickListener(v -> {
            Intent i = new Intent(getApplicationContext(), Atividade2.class);
            String msg=et.getText().toString();
            i.putExtra("msg", msg);
            startActivity(i);
        });


    }
}