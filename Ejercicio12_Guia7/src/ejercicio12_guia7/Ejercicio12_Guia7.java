

package ejercicio12_guia7;

//@author pittu

import Entidad.Persona;
import Servicio.ServicioPersona;


public class Ejercicio12_Guia7 {

    public static void main(String[] args) {
         Persona p1=new Persona();        
        ServicioPersona accion= new ServicioPersona();
        
        accion.crearPersona(p1);
        accion.calcularEdad(p1);
        
        if (accion.menorQue(p1)) {
            System.out.println("La persona es menor");
            
        }else{
            System.out.println("la persona es mayor");}
        
        accion.mostrarPersona(p1);
        
        
        
        
        
        
        
        
        
        
    }

}
