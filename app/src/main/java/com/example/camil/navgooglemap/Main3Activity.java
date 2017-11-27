package com.example.camil.navgooglemap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.camil.navgooglemap.models.Contralorias2;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity  extends RecyclerView.Adapter<Main3Activity.ViewHolder>

        {

public static class ViewHolder extends  RecyclerView.ViewHolder{
        private TextView tvDep,tvCap,tvDir,tvTel,tvemail;
        private CardView cv;
        private ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);

            tvDep =(TextView)itemView.findViewById(R.id.tvDep);
            tvCap =(TextView)itemView.findViewById(R.id.tvCap);
            tvDir =(TextView)itemView.findViewById(R.id.tvDir);
            tvemail =(TextView)itemView.findViewById(R.id.tvemail);
            tvTel =(TextView)itemView.findViewById(R.id.tvTel);

            cv =(CardView) itemView.findViewById(R.id.cv);
            image =(ImageView) itemView.findViewById(R.id.imageView);






        }
    }

    public List<Contralorias2> lista;

    public Main3Activity(List<Contralorias2> lista) {
        this.lista = lista;
    }


    public Main3Activity.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main3,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }


    public void onBindViewHolder(ViewHolder holder, int position) {


        holder.tvDep.setText(lista.get(position).getDepartamento());
        holder.tvCap.setText(lista.get(position).getCapital());
        holder.tvDir.setText(lista.get(position).getDireccion());
        holder.tvTel.setText(lista.get(position).getTelefono1());
        holder.tvemail.setText(lista.get(position).getEMail());


    }



    public int getItemCount() { return lista.size(); }
}


