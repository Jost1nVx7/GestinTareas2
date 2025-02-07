/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestortarea.Control;

import ec.edu.espoch.gestortarea.Modelo.Tareas;
import ec.edu.espoch.gestortarea.Vista.Principal;
import ec.edu.espoch.gestortarea.tester.TesterControlador;

/**
 *
 * @author Global Technology Ec
 */
public class Controlador {

    private Principal principal;

    public Controlador(Principal principal) {
        this.principal = principal;

    }

    public void agregarTarea() {
        try {
        TesterControlador testercontrolador = new TesterControlador();  
        Tareas objTareas = new Tareas();
        objTareas.setTitulo(this.principal.getTitulo());
        objTareas.setDescripcion(this.principal.getDescripcion());
        objTareas.setEstado(this.principal.getEstado());
        
        if (this.principal != null)
            testercontrolador.prueba(objTareas);
        }catch (Exception e){
        }
    }
}
