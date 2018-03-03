package com.example.george.practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    RadioGroup rdGroupCafe;
    RadioButton rdButtonAme, rdButtonCap, rdButtonExp;
    EditText editTextCant, editTextDesc;
    CheckBox chkBoxAz, chkBoxCre;
    Button buttonTotal;

    int total;
    int canttidad,cafe;
    String descripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        setContentView(R.layout.activity_principal);
        rdGroupCafe = (RadioGroup) findViewById(R.id.rdGroupCafe);
        rdButtonAme =(RadioButton)findViewById(R.id.rdButtonAme);
        rdButtonCap =(RadioButton)findViewById(R.id.rdButtonCap);
        rdButtonExp =(RadioButton)findViewById(R.id.rdButtonExp);
        editTextCant = (EditText)findViewById(R.id.editTextCant);
        editTextDesc = (EditText)findViewById(R.id.editTextDesc);
        chkBoxAz = (CheckBox)findViewById(R.id.chkBoxAz);
        chkBoxCre = (CheckBox)findViewById(R.id.chkBoxCre);
        buttonTotal = (Button)findViewById(R.id.buttonTotal);
    }
    public void miClick (View e){

        if (rdButtonAme.isChecked()){
            cafe = 20;
            descripcion = "Americano";
            canttidad = Integer.parseInt(editTextCant.getText().toString());

            if (chkBoxAz.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Azucar");
            }
            if (chkBoxCre.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Crema");
            }
            total = canttidad * cafe;

        }else if (rdButtonCap.isChecked()){
            cafe = 48;
            descripcion = "Capuchino";
            canttidad = Integer.parseInt(editTextCant.getText().toString());

            if (chkBoxAz.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Azucar");
            }
            if (chkBoxCre.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Crema");
            }
            total = canttidad * cafe;

        }else if (rdButtonExp.isChecked()){
            cafe = 30;
            descripcion = "Express";
            canttidad = Integer.parseInt(editTextCant.getText().toString());

            if (chkBoxAz.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Azucar");
            }
            if (chkBoxCre.isChecked()) {
                cafe = cafe + 1;
                descripcion = descripcion.concat(", Crema");
            }

            total = cafe * canttidad;

        }


        Toast.makeText(this,""+ total, Toast.LENGTH_SHORT).show();
        if (canttidad == 1) {
            editTextDesc.setText(canttidad + " Cafe " + descripcion);
        }
        else if (canttidad == 0){
            editTextDesc.setText("Coloque una cantidad mayor a 1");
        }
        else {
            editTextDesc.setText(canttidad + " Cafes " + descripcion);
        }

    }
}
