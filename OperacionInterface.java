/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 *
 * @author FP Mañana A
 */
public interface OperacionInterface {
   @GET("catalogo/dataset/b3d55e40-8263-4c0b-827d-2bb23b5e7bab/resource/907a2df0-2334-4ca7-aed6-0fa199c893ad/download/covid19_tia_zonas_basicas_salud_s.json")
    Call<Data> centros(); 
}
