

package ejercicio8_guia7_2;

//@author pittu

import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;


public class Ejercicio8_Guia7_2 {

    public static void main(String[] args) {
        ServicioCadena accion=new ServicioCadena();
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        
        Cadena c1=new Cadena();
        System.out.println("Ingrese una frase");
        c1.setFrase(leer.next());
        c1.setLongitud(c1.getFrase().length());
        
        
        
        System.out.println(c1.getFrase());
        System.out.println(c1.getLongitud());
        
        
        accion.contarVocales(c1);
        
       accion.invertirFrase(c1);
        
        accion.vecesRepetido(c1);
        
        accion.compararLongitud(c1);
        
        accion.unirFrases(c1);
       accion.reemplazar(c1);
       
        if (accion.contiene(c1)) {
            System.out.println("la letra SI esta en la frase");
            
        } else{
            System.out.println("la letra NO esta en la frase");
        }
        
        
        
        
        
        
    }

}
