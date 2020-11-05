/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

import java.util.List;

/**
 *
 * @author FP Mañana A
 */
public class PintaHTML {

    static String hacerTabla(Data centros) {
        int max=0;
        List<Centro> lista_centros=centros.getData();
        for (Centro lista_centro : lista_centros) {
            if (max<lista_centro.getCasosConfirmadosUltimos14dias()) {
                max=lista_centro.getCasosConfirmadosUltimos14dias();
            }
        }
        String html="<html><head></head><body>";
        for (Centro x : lista_centros) {
            int n_casos=x.getCasosConfirmadosUltimos14dias();
            	float color=((float)(-100*n_casos/max))+100;
            html=html+"<table border=1><tr><th>Zona Basica Salud</th><th>Casos confirmados ultimos 14 dias</th></tr>";
            
                html=html+"<tr style='background-color: hsl("+color +",100%,50%)'><td>"+x.getZonaBasicaSalud()+"</td><td>"+x.getCasosConfirmadosUltimos14dias()+"</td></tr>";
            
            html=html+"</table></body></html>";
        }
        return html;
    }


}
    
    

