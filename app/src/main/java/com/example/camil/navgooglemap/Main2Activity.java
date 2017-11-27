package com.example.camil.navgooglemap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.camil.navgooglemap.apis.Datos2;
import com.example.camil.navgooglemap.models.Contralorias;
import com.example.camil.navgooglemap.models.Contralorias2;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Main2Activity extends AppCompatActivity {

    private Retrofit retrofit;
    public final static String TAG = "Datos colombia";
    private RecyclerView rv;
    private Main3Activity adaptadorMunicipio;
    private Button btn_ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        rv = (RecyclerView) findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(this));


        retrofit = new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        obtenerDatos();
        Datos2 service = retrofit.create(Datos2.class);

        controlador();

    }


    public void obtenerDatos() {

        Datos2 service = retrofit.create(Datos2.class);
        Call<List<Contralorias2>> municipioCall = service.obtenerListaMunicipios();


        municipioCall.enqueue(new Callback<List<Contralorias2>>() {
            @Override
            public void onResponse(Call<List<Contralorias2>> call, Response<List<Contralorias2>> response) {
                if (response.isSuccessful()) {
                    List milista = response.body();
                    for (int i = 0; i < milista.size(); i++) {
                        Contralorias2 m = (Contralorias2) milista.get(i);
                        adaptadorMunicipio = new Main3Activity(milista);
                        rv.setAdapter(adaptadorMunicipio);

                    }
                } else {
                    Log.e(TAG, "OnResponse" + response.errorBody());
                }

            }

            @Override
            public void onFailure(Call<List<Contralorias2>> call, Throwable t) {
                Log.e(TAG, "OnFailure" + t.getMessage());//mensaje en rojo
            }
        });//En cola
    }


    public void controlador() {

        Button btn_salir = (Button) findViewById(R.id.btn_ok);

        btn_salir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}