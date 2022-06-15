/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tablas;

import Vista.BarcoVentana;
import Vista.CapitanVentana;

/**
 *
 * @author PCG
 */
public class Tablas {

     public static void main(String[] args) {
        
        var v1 = new CapitanVentana();
        var v2 = new BarcoVentana();
        
        v1.setVisible(true);
        v2.setVisible(true);
    }
}
