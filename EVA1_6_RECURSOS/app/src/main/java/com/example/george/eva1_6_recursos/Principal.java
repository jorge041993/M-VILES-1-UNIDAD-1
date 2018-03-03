package com.example.george.eva1_6_recursos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.george.eva1_6_recursos.R.id.btnCambiarImg;

public class Principal extends AppCompatActivity implements View.OnClickListener {
    Button btnCambiarImg;
    ImageView imageView;
    boolean bBande = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnCambiarImg = (Button)findViewById(R.id.btnCambiarImg);
        imageView = (ImageView) findViewById(R.id.imageView);
        btnCambiarImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (bBande)
            imageView.setImageResource(R.drawable.carro);
        else
            imageView.setImageResource(R.drawable.carro2);
        bBande = !bBande;
    }
}
