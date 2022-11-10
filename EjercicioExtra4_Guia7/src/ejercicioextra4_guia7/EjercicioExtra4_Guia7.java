

package ejercicioextra4_guia7;

//@author pittu

import Entidad.NIF;
import Servicio.ServicioNIF;


public class EjercicioExtra4_Guia7 {

    public static void main(String[] args) {
        
        ServicioNIF accion=new ServicioNIF();
         NIF n1 = new NIF();
        
        accion.crearNIF(n1);
        
        accion.mostrar(n1);
        
        
        
        
        
    }

}
