
package ec.edu.espoch.gestortarea.tester;

import ec.edu.espoch.gestortarea.Vista.Principal;

public class TersterVista {
    
    private Principal principal;

    public TersterVista(Principal principal) {
        this.principal = principal;
    }
    
    public void Prueba (){
        //Principal principal = new Principal();
        try {
            
         System.out.println("Titulo: " + principal.getTitulo());
         System.out.println("Descripcion: " + principal.getDescripcion());
         System.out.println("Estado: " + principal.getEstado());
            
        } catch (Exception e) {
        }

    }
    
    
    
}
