

package ejercicioextra3_guia7;

//@author pittu

import Entidad.Raices;
import Servicio.ServicioRaices;


public class EjercicioExtra3_guia7 {

    public static void main(String[] args) {
        Raices r1=new Raices();
        ServicioRaices accion=new ServicioRaices();
        
        accion.llenarDatos(r1);
        System.out.println(accion.getDiscriminante(r1));
        
        accion.calcular(r1);
        
        
    }

}
