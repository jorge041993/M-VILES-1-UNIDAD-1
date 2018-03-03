package com.example.george.eva1_8_colores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int ival = (int) (Math.random()*10)+ 1;
        if (ival <=5)
        setTheme(R.style.GreenTheme_Theme);
        else
            setTheme(R.style.RedTheme_Theme);
        setContentView(R.layout.activity_principal);
    }
}
