package com.example.camil.navgooglemap.apis;

import com.example.camil.navgooglemap.models.Contralorias;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by ingcamilo on 20/11/17.
 */

public interface DatosApis {

    @GET("auc3-xnmh.json")
    Call<List<Contralorias>> obtenerListaDatoss();
}
