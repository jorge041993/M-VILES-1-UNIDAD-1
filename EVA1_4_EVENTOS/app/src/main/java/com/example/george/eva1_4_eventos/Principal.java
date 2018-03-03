package com.example.george.eva1_4_eventos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity
implements  View.OnClickListener{
    Button btnclickList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnclickList=(Button)findViewById(R.id.miClick);
        btnclickList=(Button)findViewById(R.id.LISTENER);
        btnclickList.setOnClickListener(this);
    }
    public void miClick(View v){
        Toast.makeText(this, "bienvenido", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "bienvenido listener", Toast.LENGTH_SHORT).show();
    }
}
