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

    // Metodo para contar las vocales
    public void mostrarVocales(Cadena c1) {
        int contador = 0;
        String frase = c1.getFrase().toUpperCase();
        for (int i = 0; i < c1.getLongitud(); i++) {

            if ((frase.charAt(i) == 'A') || (frase.charAt(i) == 'E') || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O') || (frase.charAt(i) == 'U')) {
                contador++;

            }

        }
        System.out.println("la cantidad de vocales es " + contador);

    }

    // Metodo para invertir la frase
    public void invertirFrase(Cadena c1) {

        String frase = c1.getFrase();
        StringBuilder fraseInversa = new StringBuilder(frase);
        frase = fraseInversa.reverse().toString();
        System.out.println("La frase invertida es= " + frase);

    }

    //Metodo para contar las veces repetida de una letra
    public void vecesRepetido(Cadena c1) {
        int contador = 0;
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {

            if ((c1.getFrase().charAt(i) == letra.charAt(0))) {
                contador++;
            }
        }
        System.out.println("la letra " + letra + " esta repetida " + contador + " veces");

    }

    // Metodo para comparar la longitud de la frase
    public void compararLongitud(Cadena c1) {
        int nuevaLong;
        String nuevaFrase;
        System.out.println("Ingrese la frase a comparar");
        nuevaFrase = leer.next();
        nuevaLong = nuevaFrase.length();
        if (nuevaLong > c1.getLongitud()) {
            System.out.println("La longitud de " + c1.getFrase() + " es de " + c1.getLongitud());
            System.out.println("la nueva frase es mas larga, tiene una longitud de " + nuevaLong);
        } else if (nuevaLong < c1.getLongitud()) {
            System.out.println("La longitud de " + c1.getFrase() + " es de " + c1.getLongitud());
            System.out.println("la nueva frase es mas corta, tiene una longitud de " + nuevaLong);

        } else {
            System.out.println("La longitud de " + c1.getFrase() + " es de " + c1.getLongitud());
            System.out.println("la nueva frase tiene la misma longitud, " + nuevaLong);
        }

    }
// metodo para unir las frases

    public void unirFrases(Cadena c1) {

        System.out.println("Ingrese la frase que va a unir");
        String nuevaFrase = leer.next();
        System.out.println("La nueva frase ingresada es: " + nuevaFrase);

        nuevaFrase = c1.getFrase().concat(nuevaFrase);
        System.out.println("La frase resultante es: " + nuevaFrase);

    }

    // metodo para reeplazar una letra
    public void reemplazar(Cadena c1) {
        String nuevaFrase = c1.getFrase();
        System.out.println("Ingrese la letra que va a remplazar a la letra 'A' ");
        String letra = leer.next();

        nuevaFrase = nuevaFrase.replace("a", letra);
        System.out.println("la frase resultante es " + nuevaFrase);

    }

    // Metodo booleano para ver si la frase contien una letra ingresada por el usuario
    public boolean contiene(Cadena c1) {
        boolean respuesta = false;
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.next();
        for (int i = 0; i < c1.getLongitud(); i++) {

            if ((c1.getFrase().charAt(i) == letra.charAt(0))) {
                respuesta = true;
            }
        }

        return respuesta;
    }

}
