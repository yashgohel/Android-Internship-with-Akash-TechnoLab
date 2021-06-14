package com.example.akashproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedListViewActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_list_view);

        imageView=findViewById(R.id.item_image1);
        textView=findViewById(R.id.item_name);

        Intent intent = getIntent();
        int image = intent.getIntExtra("image",R.drawable.gta5);
        imageView.setImageResource(image);

        String name=intent.getStringExtra("name");
        textView.setText(name);

    }
}