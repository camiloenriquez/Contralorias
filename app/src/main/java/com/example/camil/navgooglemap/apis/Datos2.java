package com.example.camil.navgooglemap.apis;

import com.example.camil.navgooglemap.models.Contralorias2;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ingcamilo on 20/11/17.
 */

public interface Datos2 {

    @GET("auc3-xnmh.json")
    Call<List<Contralorias2>> obtenerListaMunicipios();

}
