

package ventadeentradas;

//@author pittu

import Entidad.VentaEntradas;
import Servicio.ServicioVentaEntradas;


public class Principal {

    public static void main(String[] args) {
        ServicioVentaEntradas accion=new ServicioVentaEntradas();
        VentaEntradas v1=new VentaEntradas();
        
        
        accion.menu(v1);
        
        
        
    }

}
