package com.example.semoc_bes_droid_builders;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        String name = getIntent().getStringExtra("NAME");
        String local = getIntent().getStringExtra("LOCAL");
        String data = getIntent().getStringExtra("DATE");
        String type = getIntent().getStringExtra("TYPE") ;
        int image = getIntent().getIntExtra("IMAGE",0);

        TextView textName = findViewById(R.id.name);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
//        ImageView imagem = findViewById(R.id.imageview);

        textName.setText(name);
        textView2.setText(local);
        textView3.setText(data);
        textView4.setText(type);
//        imagem.setImageResource(image);

    }
}