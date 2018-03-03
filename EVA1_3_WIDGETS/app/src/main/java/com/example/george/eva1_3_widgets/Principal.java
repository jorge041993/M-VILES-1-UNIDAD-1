package com.example.george.eva1_3_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Principal extends AppCompatActivity {

    TextView txthola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txthola = (TextView)findViewById(R.id.txthola);
        txthola.setText("HOLIS!!");
    }
}
