package com.example.equiposgrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class DetalleEquipo extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {

       String dnombre, dciudad, dliga;
       int dranking, dantiguedad, dfotoEstadio, dfotoEquipo, dfotoLogo;
       TextView lynombre, lyciudad, lyliga, lyranking, lyantiguedad;
       ImageView lyfotoEstadio, lyfotoEquipo, lyfotoLogo;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_equipo);

        Bundle bundle=getIntent().getExtras();
        dnombre = bundle.getString("NOMBRE");
        dciudad = bundle.getString("CIUDAD");
        dliga = bundle.getString("LIGA");
       // String ranking = recoveredIntent.getExtras().getString("Ranking");   si pasáramos el numero a string
       //  String antiguedad = recoveredIntent.getExtras().getString("Antiguedad");   si pasáramos el numero a string
        dranking = bundle.getInt("RANKING");
        dantiguedad = bundle.getInt("ANTIGUEDAD");
        dfotoEstadio= bundle.getInt("FOTOESTADIO");
        dfotoEquipo= bundle.getInt("FOTOEQUIPO");
        dfotoLogo = bundle.getInt("FOTOLOGO");


        lynombre = (TextView) findViewById(R.id.tv_nombre);
        lyciudad = (TextView) findViewById(R.id.tv_ciudad);
        lyliga = (TextView) findViewById(R.id.tv_liga);
        lyranking = (TextView) findViewById(R.id.tv_ranking);
        lyantiguedad= (TextView) findViewById(R.id.tv_antiguedad);
        lyfotoEstadio= (ImageView) findViewById(R.id.img_estadio);
        lyfotoEquipo = (ImageView)findViewById(R.id.img_equipo);
        lyfotoLogo = (ImageView) findViewById(R.id.img_logo);

        lynombre.setText("EQUIPO :  " + dnombre);
        lyciudad.setText("CIUDAD : "+dciudad);
        lyliga.setText("LIGA "+ dliga);
        lyranking.setText("RANKING "+dranking);
        lyantiguedad.setText("ANTIGUEDAD "+dantiguedad);
        lyfotoEstadio.setImageResource(dfotoEstadio);
        lyfotoEquipo.setImageResource(dfotoEquipo);
        lyfotoLogo.setImageResource(dfotoLogo);

    }

    public void cerrarVentana(View view) {
        finish();
    }
}