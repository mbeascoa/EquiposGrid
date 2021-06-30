package com.example.equiposgrid;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {


    private RecyclerView miRecicler;
    private RecyclerView.Adapter miAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buscamos el control para cargar los datos
        miRecicler = (RecyclerView) findViewById(R.id.rv_Equipos);

        // Añadimos que  el tamaño del RecyclerView no se cambiará

        miRecicler.setHasFixedSize(true);

        miRecicler.setLayoutManager(new GridLayoutManager(this, 4));
        //Especificamos el adaptador con la lista a visualizar
        miAdapter = new Adaptador(DatosEquipos());
        miRecicler.setAdapter(miAdapter);

    }

    public List<Equipos> DatosEquipos() {

        // String mnameTeam, String mcityTeam, String mliga, int mranking, int mantiguedad, int mfotoEstadio,int mfotoLogo
        ArrayList<Equipos> Lista = new ArrayList();

        Lista.add(new Equipos("Alaves", "Vitoria", "Primera División", 12, 1962, R.drawable.alaves_estad, R.drawable.alaves, R.drawable.alaves_team));
        Lista.add(new Equipos("Real Sociedad", "Donosti", "Primera División", 8, 1955, R.drawable.anoeta, R.drawable.realso, R.drawable.sociedad_team));
        Lista.add(new Equipos("Atletic Bilbao", "Bilbo", "Primera División", 2, 1942, R.drawable.sanmames, R.drawable.athl, R.drawable.bilbao_team));
        Lista.add(new Equipos("Athetico de Madrid", "Madrid", "Primera División", 19, 1967, R.drawable.calderon, R.drawable.atletico, R.drawable.atletico_team));
        Lista.add(new Equipos("Real Madrid", "Madrid", "Primera División", 1, 1945, R.drawable.bernabeu, R.drawable.realma, R.drawable.madrid_team));
        Lista.add(new Equipos("Osasuna", "Pamplona", "Primera División", 4, 1943, R.drawable.osasuna_est, R.drawable.osasu, R.drawable.osasuna_team));
        Lista.add(new Equipos("Malaga", "Malaga", "Primera División", 5, 1949, R.drawable.rosaleda, R.drawable.malaga, R.drawable.malaga_team));
        Lista.add(new Equipos("Sevilla", "Sevilla", "Primera División", 19, 1963, R.drawable.pizjuan, R.drawable.sevilla, R.drawable.sevilla_team));
        Lista.add(new Equipos("Tenerife", "Tenerife", "Primera División", 21, 1923, R.drawable.heliodoro, R.drawable.tenerif, R.drawable.tenerife_team));
        Lista.add(new Equipos("Español", "Barcelona", "Primera División", 18, 1941, R.drawable.espanyol_est, R.drawable.espanol, R.drawable.espanol_team));
        Lista.add(new Equipos("Celta", "Vigo", "Primera División", 13, 1962, R.drawable.celtaestadio, R.drawable.celta, R.drawable.celta_team));
        Lista.add(new Equipos("Las Palmas", "Gran Canaria", "Primera División", 15, 1952, R.drawable.insular, R.drawable.laspalmas, R.drawable.laspalmas_team));
        Lista.add(new Equipos("Rayo Vallecano", "Madrid", "Primera División", 25, 1953, R.drawable.rayoestadio, R.drawable.rayo, R.drawable.rayo_team));
        Lista.add(new Equipos("Mallorca", "Mallorca", "Primera División", 18, 1952, R.drawable.sonmoix, R.drawable.laspalmas, R.drawable.laspalmas_team));
        Lista.add(new Equipos("Malaga", "Malaga", "Primera División", 16, 1952, R.drawable.rosaleda, R.drawable.malaga, R.drawable.malaga_team));
        Lista.add(new Equipos("Betis", "Sevilla", "Primera División", 6, 1952, R.drawable.pizjuan, R.drawable.sevilla, R.drawable.sevilla_team));
        Lista.add(new Equipos("Villareal", "Castellon", "Primera División", 26, 1952, R.drawable.madrigal, R.drawable.villareal, R.drawable.villareal_team));

        return Lista;
    }
}
