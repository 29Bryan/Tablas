/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicio;

import Modelo.Capitan;
import java.util.List;

/**
 *
 * @author PCG
 */
public interface ICapitanServicio {
    public Capitan crear(Capitan capitan);
    public List<Capitan>listar();
}
