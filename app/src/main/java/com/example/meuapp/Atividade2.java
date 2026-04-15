package com.example.meuapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Atividade2 extends AppCompatActivity {
    Button botaoFechar;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_atividade2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        botaoFechar=findViewById(R.id.btnfechar);
        tv=findViewById(R.id.tv2);
        Intent i = getIntent();
        Bundle b=i.getExtras();
        String msg = b.getString("msg");
        tv.setText(msg);
        botaoFechar.setOnClickListener(v -> {
            finish();
        });

    }
}