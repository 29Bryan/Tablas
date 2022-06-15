/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Capitan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PCG
 */
public class CapitanServicio implements ICapitanServicio{
    
    private final List<Capitan> capitanList= new ArrayList<>();

    @Override
    public Capitan crear(Capitan capitan) {
        this.capitanList.add(capitan); 
        return capitan; 
    }

    @Override
    public List<Capitan> listar() {
        return this.capitanList; 
    }

    @Override
    public Capitan buscarPorCodigo(int codigoCapitan) {
        Capitan capitan=null;
        
        for(var c:this.capitanList){
            if(codigoCapitan==c.getCodigo()){
                capitan=c;
                break;
            }
        }
        return capitan;
    }
    
}
