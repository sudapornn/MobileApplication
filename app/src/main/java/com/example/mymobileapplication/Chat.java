package com.example.mymobileapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Chat extends AppCompatActivity {

    private TextView textView;
    private EditText etInputText;
    private Button bSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        String smarthomename = getIntent().getStringExtra("smarthomename");

        // เชื่อมต่อ UI components
        textView = findViewById(R.id.sellerNameTextView);
        etInputText = findViewById(R.id.etInputText);
        bSend = findViewById(R.id.bSend);

        textView.setText("Chat with " + smarthomename);

        bSend.setOnClickListener(v -> {
            String message = etInputText.getText().toString();
            if (!message.isEmpty()) {
                textView.append("\n" + message);
                etInputText.setText("");
            }
        });
    }
}