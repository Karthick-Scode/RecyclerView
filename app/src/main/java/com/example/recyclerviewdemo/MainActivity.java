package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item(R.drawable.iphone,"Iphone 14 Pro Max","1,89,900 INR", "795m - 1 month"));
        items.add(new Item(R.drawable.img,"Nothing Phone 1","35,999 INR", "795m - 1 month"));
        items.add(new Item(R.drawable.img_1,"OnePlus 11 5G","61,900 INR", "795m - 1 month"));
        items.add(new Item(R.drawable.img_2,"Pixel 7 Pro","79,999 INR", "795m - 1 month"));
        items.add(new Item(R.drawable.img_3,"Galaxy S23 Ultra","1,24,999 INR", "795m - 1 month"));
        items.add(new Item(R.drawable.img_4,"Xiaomi 12 Pro","88,999 INR", "795m - 1 month"));



        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}