package com.example.mymobileapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;


public class Vedeo extends AppCompatActivity {
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedeo);

        VideoView videoView = findViewById(R.id.videoView);
        button4 = findViewById(R.id.button4);

        Uri videoUri = Uri.parse("https://videos.pexels.com/video-files/8581127/8581127-hd_1920_1080_30fps.mp4");

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(videoUri);
        videoView.requestFocus();
        videoView.start();
        ImageView imageView1 = findViewById(R.id.imageView6);
        imageView1.setOnClickListener(v -> {
            Intent intent = new Intent(Vedeo.this, Product.class);
            intent.putExtra("roomType", "bedroom");
            startActivity(intent);
        });

        ImageView imageView2 = findViewById(R.id.imageView7);
        imageView2.setOnClickListener(v -> {
            Intent intent = new Intent(Vedeo.this, Product.class);
            intent.putExtra("roomType", "bathroom");
            startActivity(intent);
        });

        ImageView imageView3 = findViewById(R.id.imageView8);
        imageView3.setOnClickListener(v -> {
            Intent intent = new Intent(Vedeo.this, Product.class);
            intent.putExtra("roomType", "kitchen");
            startActivity(intent);
        });

        ImageView imageView4 = findViewById(R.id.imageView9);
        imageView4.setOnClickListener(v -> {
            Intent intent = new Intent(Vedeo.this, Product.class);
            intent.putExtra("roomType", "livingroom");
            startActivity(intent);
        });

        button4.setOnClickListener(view -> {
            Intent intent = new Intent(Vedeo.this, MainActivity.class);
            startActivity(intent);
        });

    }
}