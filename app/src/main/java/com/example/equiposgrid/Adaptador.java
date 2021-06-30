package com.example.equiposgrid;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolder> {

    private List<Equipos> listaEquipos;

    public Adaptador(List<Equipos> ListaEquipo) {
        this.listaEquipos = ListaEquipo;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listado_datos, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

     String city = listaEquipos.get(position).getCityTeam();
     String liga = listaEquipos.get(position).getLiga();
     int ranking = listaEquipos.get(position).getRanking();
     int antiguedad = listaEquipos.get(position).getAntiguedad();
     int fotoEstadio =listaEquipos.get(position).getFotoEstadio();
     int fotoEquipo = listaEquipos.get(position).getFotoEquipo();

     String tit = listaEquipos.get(position).getNameTeam();
     holder.txtnombre.setText(tit);

     int fotopeli = listaEquipos.get(position).getFotoLogo();
     holder.fotoLogo.setImageResource(fotopeli);

     holder.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(holder.txtnombre.getText().toString());

                Intent myactivity = new Intent(holder.itemView.getContext(), DetalleEquipo.class);

                // Equipos equipo = new Equipos();   no se puede pasar por un intent sin serializar la clase
                //myactivity.addFlags(FLAG_ACTIVITY_NEW_TASK);
                myactivity.putExtra("NOMBRE", tit);
                myactivity.putExtra("CIUDAD", city);
                myactivity.putExtra("LIGA", liga);
                // myactivity.putExtra("Ranking", Integer.toString(ranking));
                // myactivity.putExtra("Antiguedad", Integer.toString(antiguedad));
                myactivity.putExtra("RAMNKING", ranking);
                myactivity.putExtra("ANTIGUEDAD", antiguedad);
                myactivity.putExtra("FOTOESTADIO", fotoEstadio);
                myactivity.putExtra("FOTOEQUIPO", fotoEquipo);
                myactivity.putExtra("FOTOLOGO", fotopeli);

                holder.itemView.getContext().startActivity(myactivity);

            }
        });
    }


    @Override
    public int getItemCount() {
        return listaEquipos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtnombre;
        private ImageView  fotoLogo;
        private CardView card1;

        public ViewHolder(View v) {
            super(v);
            txtnombre = (TextView) v.findViewById(R.id.txtnombre);
            fotoLogo = (ImageView) v.findViewById((R.id.img_FotoLogo));
            card1= (CardView) v.findViewById(R.id.cv_Equipos);
        }
    }
}

