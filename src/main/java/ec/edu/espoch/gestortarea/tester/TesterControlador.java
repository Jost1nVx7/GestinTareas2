/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestortarea.tester;

import ec.edu.espoch.gestortarea.Control.Controlador;
import ec.edu.espoch.gestortarea.Modelo.Tareas;

/**
 *
 * @author Global Technology Ec
 */
public class TesterControlador {

    public void prueba(Tareas objTarea) {
        System.out.println("Titulo" + objTarea.getTitulo());
        System.out.println("Descripcion" + objTarea.getDescripcion());
        System.out.println("Estado" + objTarea.getEstado());
    }
}
