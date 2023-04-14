package com.example.recyclerviewdemo;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView name, price, month;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.imageview);
        name = itemView.findViewById(R.id.textview1);
        price = itemView.findViewById(R.id.textview2);
        month = itemView.findViewById(R.id.textview3);
    }
}
