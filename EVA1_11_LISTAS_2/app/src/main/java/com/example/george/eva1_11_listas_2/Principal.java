package com.example.george.eva1_11_listas_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView list1;
    TextView txt1;
    String [] asLista = {"UNO","DOS","TRES","CUATRO","CINCO","SEIS",
            "SIETE","OCHO","NUEVE","DIEZ","ONCE","DOCE","TRECE","CATORSE"};
    String [] asDetalle = {"En esta fase se cubren por un lado las necesidades de formación del " +
            "cliente (que tiene que aprender a utilizar el software que hemos desarrollado para él). " +
            "Por otro lado, se insertan las herramientas de analítica web que en el futuro informarán si " +
            "se están cumpliendo los objetivos de negocio: conversión, compras, detección de embudos….etc. YYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY" +
            "SDFSDFSDFDSFSDFSDFDSFSDFSDFSDFSDF" +
            "SDFSDFSDFSDFSDFSDFSDFSDFSDFSDFSDF" +
            "SDFSDFSDFSDFSDFSDFSDFFSDFSDFSDFSDFSD" +
            "FSDFSDFSDFSDFSDFSDFSDF" +
            "","SDFSDF","GRREGREG","DFSDF","FSDF","REW","SDSDFSD","FSDF","FSDF","DFSDFDSF","CALL",
            "ADRIAN","CH","LO"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txt1 = (TextView)findViewById(R.id.txt1);
        list1 = (ListView) findViewById(R.id.list1);
        //ADAPTADOR
        ArrayAdapter<String> aaDatos = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1,asLista);
        list1.setAdapter(aaDatos);
        list1.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        txt1.setText(asDetalle[i]);
        //Alert Dialog
        new AlertDialog.Builder(this).setTitle("Seleccion de la lista")
                .setMessage(asLista[i])
                .setIcon(R.drawable.ic_launcher_background)

                //BOTONES DEL CUADRO DIALOGO
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Pues ok", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Pues Cancel", Toast.LENGTH_SHORT).show();
                    }

                })
                .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(), "Pues ok", Toast.LENGTH_SHORT).show();
                    }
                });


    }
}
