package com.example.mymobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class Successorder extends AppCompatActivity {
    private Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successorder);

        button5 = findViewById(R.id.button5);

        button5.setOnClickListener(view -> {
            Intent intent = new Intent(Successorder.this, Vedeo.class);
            startActivity(intent);
        });
    }
}
