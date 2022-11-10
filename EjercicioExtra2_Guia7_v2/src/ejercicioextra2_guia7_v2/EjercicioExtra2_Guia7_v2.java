

package ejercicioextra2_guia7_v2;

//@author pittu

import Entidad.Puntos;
import Servicio.ServicioPuntos;





public class EjercicioExtra2_Guia7_v2 {

    public static void main(String[] args) {
        ServicioPuntos accion=new ServicioPuntos();
       Puntos c1= accion.crearPuntos();
       
       
        System.out.println("la distancia es: " + accion.calcularDistancia(c1));
       
        
        
    }

}
