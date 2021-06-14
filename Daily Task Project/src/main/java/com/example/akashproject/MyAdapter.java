package com.example.akashproject;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

    Context context;
    int[] image;
    String name[];
    LayoutInflater layoutInflater;

    public MyAdapter(Context context, int[] image, String[] name) {
        this.context = context;
        this.image = image;
        this.name = name;
        layoutInflater = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"ViewHolder", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = layoutInflater.inflate(R.layout.row_list_view, null);

        ImageView imageView =(ImageView) convertView.findViewById(R.id.item_image);
        TextView textView =(TextView) convertView.findViewById(R.id.item_desc);

        imageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return convertView;
    }
}
