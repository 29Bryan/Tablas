/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Barco;
import java.util.List;

/**
 *
 * @author PCG
 */
public interface IBarcoServicio {
    public Barco crear(Barco barco);
    public Barco modificar(int codigoBarco, Barco barcoNuevo);
    public Barco eliminar(int codigoBarco);
    public Barco buscarPorCodigo(int codigoBarco);
    public int buscarPosicion(Barco barco);
    public List<Barco> listar(); 
}
