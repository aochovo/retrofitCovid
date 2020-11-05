/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Centro {

@SerializedName("codigo_geometria")
@Expose
private String codigoGeometria;
@SerializedName("zona_basica_salud")
@Expose
private String zonaBasicaSalud;
@SerializedName("tasa_incidencia_acumulada_ultimos_14dias")
@Expose
private Double tasaIncidenciaAcumuladaUltimos14dias;
@SerializedName("tasa_incidencia_acumulada_total")
@Expose
private Double tasaIncidenciaAcumuladaTotal;
@SerializedName("casos_confirmados_totales")
@Expose
private Integer casosConfirmadosTotales;
@SerializedName("casos_confirmados_ultimos_14dias")
@Expose
private Integer casosConfirmadosUltimos14dias;
@SerializedName("fecha_informe")
@Expose
private String fechaInforme;

public String getCodigoGeometria() {
return codigoGeometria;
}

public void setCodigoGeometria(String codigoGeometria) {
this.codigoGeometria = codigoGeometria;
}

public String getZonaBasicaSalud() {
return zonaBasicaSalud;
}

public void setZonaBasicaSalud(String zonaBasicaSalud) {
this.zonaBasicaSalud = zonaBasicaSalud;
}

public Double getTasaIncidenciaAcumuladaUltimos14dias() {
return tasaIncidenciaAcumuladaUltimos14dias;
}

public void setTasaIncidenciaAcumuladaUltimos14dias(Double tasaIncidenciaAcumuladaUltimos14dias) {
this.tasaIncidenciaAcumuladaUltimos14dias = tasaIncidenciaAcumuladaUltimos14dias;
}

public Double getTasaIncidenciaAcumuladaTotal() {
return tasaIncidenciaAcumuladaTotal;
}

public void setTasaIncidenciaAcumuladaTotal(Double tasaIncidenciaAcumuladaTotal) {
this.tasaIncidenciaAcumuladaTotal = tasaIncidenciaAcumuladaTotal;
}

public Integer getCasosConfirmadosTotales() {
return casosConfirmadosTotales;
}

public void setCasosConfirmadosTotales(Integer casosConfirmadosTotales) {
this.casosConfirmadosTotales = casosConfirmadosTotales;
}

public Integer getCasosConfirmadosUltimos14dias() {
return casosConfirmadosUltimos14dias;
}

public void setCasosConfirmadosUltimos14dias(Integer casosConfirmadosUltimos14dias) {
this.casosConfirmadosUltimos14dias = casosConfirmadosUltimos14dias;
}

public String getFechaInforme() {
return fechaInforme;
}

public void setFechaInforme(String fechaInforme) {
this.fechaInforme = fechaInforme;
}

}
