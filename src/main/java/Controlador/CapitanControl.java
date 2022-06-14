/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Capitan;
import Servicio.CapitanServicio;
import java.util.List;

/**
 *
 * @author PCG
 */
public class CapitanControl {
    private final CapitanServicio capitanServicio = new CapitanServicio(); 
    
    public Capitan crear(String [] args){
        var capitan = new Capitan(Integer.valueOf(args[0]),args[1],args[2]); 
        this.capitanServicio.crear(capitan);
        return capitan;
    }
    
    public List<Capitan> listar()
    {
        return this.capitanServicio.listar();
    }
}
