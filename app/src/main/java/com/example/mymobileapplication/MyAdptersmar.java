package com.example.mymobileapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mymobileapplication.model.smarthome;

import java.util.List;

public class MyAdptersmar extends RecyclerView.Adapter<MyAdptersmar.ViewHolder>{
    private List<smarthome> values;
    private Context context;

    public MyAdptersmar(List<smarthome> values, Context context) {
        this.values = values;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgView;
        public TextView textHeader;
        public TextView textFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imgView = (ImageView)  v.findViewById(R.id.icon);
            textHeader = (TextView) v.findViewById(R.id.firstLine);
            textFooter = (TextView) v.findViewById(R.id.secondLine);
        }
    }


    @Override
    public MyAdptersmar.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);
        MyAdptersmar.ViewHolder vh = new MyAdptersmar.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyAdptersmar.ViewHolder holder, final int position) {
        final smarthome smarthomes = values.get(position);
        holder.textHeader.setText(smarthomes.getSmarthome_name());
        holder.textFooter.setText(smarthomes.getSmarthome_detail());
        holder.textFooter.setText(smarthomes.getSmarthome_price());

        Glide.with(context)
                .load(smarthomes.getSmarthome_image())
                .into(holder.imgView);

        holder.imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Chat.class);
                intent.putExtra("smarthomename", smarthomes.getSmarthome_detail());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }
}
