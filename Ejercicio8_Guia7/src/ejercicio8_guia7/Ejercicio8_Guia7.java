package ejercicio8_guia7;

//@author pittu
import Entidad.Cadena;
import Servicio.ServicioCadena;
import java.util.Scanner;

public class Ejercicio8_Guia7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        Cadena c1 = new Cadena();
        System.out.println("Ingrese la frase");
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());

        System.out.println("la frase es " + c1.getFrase());
        System.out.println("la longitud es " + c1.getLongitud());
        
        
        ServicioCadena accion=new ServicioCadena();
        
        accion.mostrarVocales(c1);
        
        accion.invertirFrase(c1);
        
        accion.vecesRepetido(c1);
        
        accion.compararLongitud(c1);
        
        accion.unirFrases(c1);
        
        accion.reemplazar(c1);
        
        //use de metodo contiene
        if (accion.contiene(c1)==true) {
            System.out.println("SI se encontro la letra dentro de la frase");
        } else{
        System.out.println("NO se encontro la letra dentro de la frase");
        }
        
        
        

    }

}
