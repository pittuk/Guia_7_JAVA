

package ejercicioextra5_guia7;

//@author pittu

import java.util.Scanner;


public class EjercicioExtra5_Guia7 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String[] meses={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
         int mesSecreto = (int) (Math.random()*12);
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:");
        String mesUser=leer.nextLine();
        
        while (!mesUser.equalsIgnoreCase(meses[mesSecreto])) {
                        
            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            mesUser=leer.nextLine();
            
            
        }
        
         System.out.println("¡Ha acertado!");
        
             
        
        
        
        
    }

}
