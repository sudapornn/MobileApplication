package com.example.mymobileapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymobileapplication.model.smarthome;

import java.util.ArrayList;
import java.util.List;

public class Product extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        String roomType = getIntent().getStringExtra("roomType");

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<smarthome> smarthomes = new ArrayList<>();

        if ("bedroom".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("เตียงนอน");
            smarthome1.setSmarthome_image("https://i.pinimg.com/736x/82/bc/6f/82bc6fbce005b7954e4230a6cf68b39a.jpg");
            smarthome1.setSmarthome_detail("ร้านขายเตียงนอน");
            smarthome1.setSmarthome_price("3000");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("หมอน");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/9b/ce/a0/9bcea0667d1f7cef8e92e1bb9ccb595c.jpg");
            smarthome2.setSmarthome_detail("ร้านขายหมอน");
            smarthome2.setSmarthome_price("7900");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("ผ้าห่ม");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/8a/9f/22/8a9f22ad7d8692f2ac6a21b08e32f36b.jpg");
            smarthome3.setSmarthome_detail("ร้านขายผ้าห่ม");
            smarthome3.setSmarthome_price("9000");
            smarthomes.add(smarthome3);

        } else if ("bathroom".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("ฝักบัว");
            smarthome1.setSmarthome_image("https://i.pinimg.com/564x/df/79/6b/df796bbb4d527fa16dca5e522ee8fca0.jpg");
            smarthome1.setSmarthome_detail("ร้านขายฝักบัว");
            smarthome1.setSmarthome_price("1200");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("ชั้นวางในห้องน้ำ");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/2a/6c/3c/2a6c3c8cfae059049c436dddbbe01f55.jpg");
            smarthome2.setSmarthome_detail("ร้านขายชั้นวางในห้องน้ำ");
            smarthome2.setSmarthome_price("1500");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("ผ้าขนหนู");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/fc/50/6b/fc506bfb334a4d9d7d41792af2fc95a0.jpg");
            smarthome3.setSmarthome_detail("ร้านขายผ้าขนหนู");
            smarthome3.setSmarthome_price("2500");
            smarthomes.add(smarthome3);

        } else if ("kitchen".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("เครื่องปั่น");
            smarthome1.setSmarthome_image("https://i.pinimg.com/736x/c8/22/8f/c8228f82c0ca33c512e416b48a62a679.jpg");
            smarthome1.setSmarthome_detail("ร้านขายเครื่องปั่น");
            smarthome1.setSmarthome_price("1500");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("กระทะ");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/2e/30/99/2e30999d20dad3dfe23747e96c4b5cd5.jpg");
            smarthome2.setSmarthome_detail("ร้านขายกระทะ");
            smarthome2.setSmarthome_price("5020");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("มีด");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/67/a4/87/67a487f7aa41abf9c7fc480d68b6aba3.jpg");
            smarthome3.setSmarthome_detail("ร้านขายมีด");
            smarthome3.setSmarthome_price("2700");
            smarthomes.add(smarthome3);

        } else if ("livingroom".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("โซฟา");
            smarthome1.setSmarthome_image("https://i.pinimg.com/564x/14/5c/e6/145ce6621ad9658f37f508476f5cd8d4.jpg");
            smarthome1.setSmarthome_detail("ร้านขายโซฟา");
            smarthome1.setSmarthome_price("8000");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("โคมไฟตั้งพื้น");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/37/85/97/378597b942c8e6a8e36b6d149f7ce07a.jpg");
            smarthome2.setSmarthome_detail("ร้านขายโคมไฟตั้งพื้น");
            smarthome2.setSmarthome_price("10000");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("ชั้นวางทีวี");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/89/33/10/8933105257d702479bffdf51b4259705.jpg");
            smarthome3.setSmarthome_detail("ร้านขายชั้นวางทีวี");
            smarthome3.setSmarthome_price("55000");
            smarthomes.add(smarthome3);
        }

        mAdapter = new MyAdptersmar(smarthomes, this);
        recyclerView.setAdapter(mAdapter);
    }
}