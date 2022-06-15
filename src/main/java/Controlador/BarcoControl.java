/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Barco;
import Modelo.Capitan;
import Servicio.BarcoServicio;
import Servicio.CapitanServicio;
import java.util.List;

/**
 *
 * @author PCG
 */
public class BarcoControl {
    private final BarcoServicio barcoServicio = new BarcoServicio();
    private final CapitanServicio capitanServicio = new CapitanServicio();
    
    public Barco crear(String [] args){
        Capitan capitan = this.capitanServicio.buscarPorCodigo(Integer.valueOf(args[4]));
        Barco barco = new Barco(Integer.valueOf(args[0]),args[1],args[2],args[3],capitan);
        this.barcoServicio.crear(barco);
        return barco;
    }
    
    public List<Barco> listar(){
        return this.barcoServicio.listar();
    }
}
