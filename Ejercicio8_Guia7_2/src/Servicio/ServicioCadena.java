/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioCadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    // metodo para contar vocales
    public void contarVocales(Cadena c1) {
        int contador = 0;
        String frase = c1.getFrase().toUpperCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ((frase.charAt(i) == 'A') || (frase.charAt(i) == 'E') || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O') || (frase.charAt(i) == 'U')) {
                contador++;

            }

        }
        System.out.println("Se encontraron " + contador + " vocales");

    }

    //metodo para invertir la frase
    public void invertirFrase(Cadena c1) {
        String fraseInvertida = "";

        for (int i = c1.getLongitud(); i > 0; i--) {
            fraseInvertida = fraseInvertida.concat(c1.getFrase().substring(i - 1, i));

        }

        System.out.println("la frase actual es " + c1.getFrase());
        System.out.println("la frase actual es " + fraseInvertida);

    }

    //metodo para contar veces repetida letra en la frase
    public void vecesRepetido(Cadena c1) {
        int contador = 0;
        String frase = c1.getFrase().toUpperCase();
        System.out.println("Ingrese la letra");
        String letra = leer.next();
        letra = letra.toUpperCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ((frase.charAt(i) == letra.charAt(0))) {
                contador++;

            }

        }
        System.out.println("Se encontro " + contador + " veces repetida");

    }

    // metodo comprar longitud
    public void compararLongitud(Cadena c1) {
        System.out.println("Ingrese frase para comparar longitud");
        String fraseNueva = leer.next();

        if (c1.getFrase().length() == fraseNueva.length()) {
            System.out.println("tiene la misma longitud");

        } else if (c1.getFrase().length() > fraseNueva.length()) {
            System.out.println("La nueva frase es mas corta que la anterior");

        } else {
            System.out.println("La nueva frase es mas larga que la anterior");
        }

    }

    //metodo para unir frase
    public void unirFrases(Cadena c1) {
        System.out.println("ingrese frase a unir");
        String fraseNueva = leer.next();
        System.out.println("la frase actual es " + c1.getFrase());
        System.out.println("la frase nueva es " + fraseNueva);

        fraseNueva = c1.getFrase() + fraseNueva;

        System.out.println("la frase resultante es " + fraseNueva);

    }

    //metodo sustituir letras
    public void reemplazar(Cadena c1) {
        System.out.println("Ingrese la letra que va a sustituir por la 'A'");
        String letra = leer.next();

        String nuevafrase = c1.getFrase().replace("a", letra);

        System.out.println("la frase resultante es " + nuevafrase);

    }

    public boolean contiene(Cadena c1) {
        boolean respuesta=false;

        System.out.println("Ingrese la letra");
        String letra = leer.next();
        letra = letra.toUpperCase();
        String frase = c1.getFrase().toUpperCase();
        for (int i = 0; i < c1.getLongitud(); i++) {
            if ((frase.charAt(i) == letra.charAt(0))) {
                respuesta = true;

            }

        }
        return respuesta;
        
    }

}
