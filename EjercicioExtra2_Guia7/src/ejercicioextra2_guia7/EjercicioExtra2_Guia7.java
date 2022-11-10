

package ejercicioextra2_guia7;

//@author pittu

import Entidad.Puntos;
import Servicio.ServicioPuntos;


public class EjercicioExtra2_Guia7 {

    public static void main(String[] args) {
        
        Puntos p1=new Puntos();
        ServicioPuntos accion=new ServicioPuntos();
        
        accion.crearPuntos(p1);
        System.out.println("La distancia entre los 2 puntos es: " + accion.calcularDistancia(p1));
        
        
        
        
    }

}
