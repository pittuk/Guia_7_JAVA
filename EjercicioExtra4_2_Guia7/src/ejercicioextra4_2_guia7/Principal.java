

package ejercicioextra4_2_guia7;

//@author pittu

import Entidad.Fecha;
import Servicio.ServicioFecha;


public class Principal {

    public static void main(String[] args) {
        ServicioFecha accion=new ServicioFecha();
        
        Fecha f1=new Fecha();
        
        accion.ingresarFecha(f1);
        accion.diaAnterior(f1);
        accion.diaPosterior(f1);
        
        
        
        
    }

}
