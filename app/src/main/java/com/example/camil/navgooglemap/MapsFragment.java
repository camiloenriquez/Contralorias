package com.example.camil.navgooglemap;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.camil.navgooglemap.apis.DatosApis;
import com.example.camil.navgooglemap.models.Contralorias;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapsFragment extends Fragment implements OnMapReadyCallback {


    GoogleMap map;
    private Retrofit retrofit;
    public final static  String TAG="DATOS_COLOMBIA";

    public MapsFragment() {
        // Required empty public constructor
    }

SupportMapFragment  mapFragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_maps, container, false);



        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);


        retrofit=new Retrofit.Builder().baseUrl("https://www.datos.gov.co/resource/").
                addConverterFactory(GsonConverterFactory.create()).build();

    }

    public void onMapReady(GoogleMap googleMap) {
        map=googleMap;

        DatosApis service = retrofit.create(DatosApis.class);
        final Call<List<Contralorias>> municipioCall = service.obtenerListaDatoss();

        municipioCall.enqueue(new Callback<List<Contralorias>>() {
            @Override
            public void onResponse(Call<List<Contralorias>> call, Response<List<Contralorias>> response) {
                if (response.isSuccessful()) {
                    List listaMunicipios = response.body();
                    for (int i = 0; i < listaMunicipios.size(); i++) {
                        Contralorias dC = (Contralorias) listaMunicipios.get(i);
                        LatLng sydney = new LatLng(dC.getLatitud(),dC.getLongitud());
                        map.addMarker(new MarkerOptions().position(sydney).title(dC.getDepartamento()).icon(BitmapDescriptorFactory.fromResource(R.drawable.aa)));
                        // LatLng sydney = new LatLng(-34, 151);
                        map.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,1));
                        map.getUiSettings().setZoomControlsEnabled(true);
                        //mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                    }
                } else {
                    Log.e(TAG, "onResponse " + response.errorBody());
                }
            }

            @Override
            public void onFailure(Call<List<Contralorias>> call, Throwable t) {
                Log.e(TAG, "onFailure " + t.getMessage());

            }
        });

    }


}
