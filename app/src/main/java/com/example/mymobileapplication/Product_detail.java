package com.example.mymobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Product_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);



        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "bedroom");
            startActivity(intent);
        });

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "bathroom");
            startActivity(intent);
        });

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "kitchen");
            startActivity(intent);
        });

        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "livingroom");
            startActivity(intent);
        });
    }
}