/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal {
    public static void main(String[] args) {
      //Definimos la URL base del API REST que utilizamos
        String baseUrl = "https://datos.comunidad.madrid//";

        //Instancia a GSON
        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();
        
        //Instancia a retrofit agregando la baseURL y el convertidor GSON
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        
        //Se crea el servicio
        OperacionInterface service = retrofit.create(OperacionInterface.class);

        //Se realiza la llamada
        Call<Data> llamada = service.centros();
        llamada.enqueue(new Callback<Data>() {
            @Override
            public void onResponse(Call<Data> call, Response<Data> rspns) {
                Data centros=rspns.body();
                String tabla=PintaHTML.hacerTabla(centros);
                AccesoFichero.grabarLinea(tabla, "C:\\proyectosjava\\retrofitCovid\\fichero.html");
            }

            @Override
            public void onFailure(Call<Data> call, Throwable thrwbl) {
                System.out.println("Network Error :: " + thrwbl.getLocalizedMessage());
            }
        });
       
    }
    
        
        
    }

