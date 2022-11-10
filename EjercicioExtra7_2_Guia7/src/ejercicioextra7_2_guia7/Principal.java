

package ejercicioextra7_2_guia7;

//@author pittu
import Entidad.Auto;
import Servicio.ServicioAuto;



public class Principal {

    public static void main(String[] args) {
        
        ServicioAuto accion=new ServicioAuto();
        Auto a1=new Auto();
        accion.cargarFicha(a1);
        accion.menu(a1);
        
        
        
        
        
        
    }

}
