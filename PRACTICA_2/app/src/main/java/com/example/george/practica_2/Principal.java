package com.example.george.practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    EditText editTextAño;
    RadioGroup rdGrpReg, rdGrpGen;
    RadioButton radioButtonRd, radioButtonAl, radioButtonAs, radioButtonAf, radioButtonH, radioButtonM;
    TextView textViewEv, textViewFpd;
    int Iao, IExp, IDif, IFDes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        editTextAño=(EditText)findViewById(R.id.editTextAño);
        rdGrpReg =(RadioGroup)findViewById(R.id.rdGrpReg);
        rdGrpGen =(RadioGroup)findViewById(R.id.rdGrpGen);
        radioButtonRd = (RadioButton)findViewById(R.id.radioButtonRd);
        radioButtonAl = (RadioButton)findViewById(R.id.radioButtonAl);
        radioButtonAs = (RadioButton)findViewById(R.id.radioButtonAs);
        radioButtonAf = (RadioButton)findViewById(R.id.radioButtonAf);
        radioButtonH = (RadioButton)findViewById(R.id.radioButtonH);
        radioButtonM = (RadioButton)findViewById(R.id.radioButtonM);
        textViewEv = (TextView)findViewById(R.id.textViewEv);
        textViewFpd = (TextView)findViewById(R.id.textViewFpd);
        radioButtonH.setEnabled(true);
        radioButtonM.setEnabled(true);
        rdGrpReg.setOnCheckedChangeListener(this);
        rdGrpGen.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        Iao = Integer.parseInt(editTextAño.getText().toString());
        if(group==rdGrpReg){
            if(checkedId==R.id.radioButtonRd){
                Desarrollados(Iao);
            }
            if(checkedId==R.id.radioButtonAl){
                America(Iao);
            }
            if(checkedId==R.id.radioButtonAs){
                Asia(Iao);
            }
            if(checkedId==R.id.radioButtonAf){
                Africa(Iao);
            }
        }
        else             if(group==rdGrpGen){
            if(checkedId==R.id.radioButtonH){
                Genero(1);
            }
            if(checkedId==R.id.radioButtonM){
                Genero(2);
            }

        }
    }

    public  void Desarrollados (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 75;
            IDif = 10;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 75;
            IDif = 9;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 80;
            IDif = 8;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 80;
            IDif = 7;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 85;
            IDif = 6;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 90;
            IDif = 4;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un año entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void America (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 60;
            IDif = 10;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 65;
            IDif = 9;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 70;
            IDif = 8;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 75;
            IDif = 7;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 75;
            IDif = 6;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 70;
            IDif = 4;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un año entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void Asia (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 45;
            IDif = 10;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 50;
            IDif = 9;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 65;
            IDif = 8;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 65;
            IDif = 7;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 60;
            IDif = 6;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 65;
            IDif = 4;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un año entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public  void Africa (int AOo){
        if (AOo>=1950 && AOo<1960){
            IExp = 35;
            IDif = 10;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1960 && AOo<1970){
            IExp = 45;
            IDif = 9;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1970 && AOo<1980){
            IExp = 55;
            IDif = 8;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1980 && AOo<1990){
            IExp = 60;
            IDif = 7;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=1990 && AOo<2000){
            IExp = 55;
            IDif = 6;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo>=2000 && AOo<2016){
            IExp = 60;
            IDif = 4;
            radioButtonH.setEnabled(true);
            radioButtonM.setEnabled(true);
        }
        else if (AOo<1960 || AOo>2015){
            Toast.makeText(this,"Ingrese un Año entre 1950 y 2015",Toast.LENGTH_LONG).show();
        }
    }

    public void Genero(int Gen){
        textViewEv.setText("");
        textViewFpd.setText("");
        if (Gen==1){
            IExp = IExp - (IDif/2);
            IFDes = Iao + IExp;
            textViewEv.setText("" + IExp + " Años");
            textViewFpd.setText("" + IFDes);
        }
        else if (Gen==2){
            IExp = IExp + (IDif/2);
            IFDes = Iao + IExp;
            textViewEv.setText("" + IExp + " Años");
            textViewFpd.setText("" + IFDes);
        }
    }
}
