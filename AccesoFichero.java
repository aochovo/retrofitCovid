/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitcovid;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author FP Mañana A
 */
public class AccesoFichero {
   public static void grabarLinea(String html_tabla, String ruta_fichero) {

        try 
                {
            FileWriter fw=new FileWriter(ruta_fichero, false);

            fw.write(html_tabla);
            fw.close();
        } 

                catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } 
}
