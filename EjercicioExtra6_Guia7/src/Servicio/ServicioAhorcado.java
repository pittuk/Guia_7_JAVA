/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioAhorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego(Ahorcado j1) {

        System.out.println("ingrese la palabra");
        String palabraNueva = leer.next();
        j1.setPalabra(palabraNueva.split(""));
        

        System.out.println("Ingrese la cantidad de jugadas máxima");
        j1.setJugadasMax(leer.nextInt());
        j1.setLetrasEcontradas(0);

    }

    public void longitud(Ahorcado j1) {
        int longitudPalabra = j1.getPalabra().length;
        System.out.println("la longitud de la palabra que se debe adivinar es: " + longitudPalabra);
        System.out.println("Tiene " + j1.getJugadasMax() + " intentos para lograrlo");

    }

    public void buscar(Ahorcado j1) {

        System.out.println("Ingrese letra a buscar");
        j1.setLetraIngresada(leer.next());
        int conter = 0;

        for (int i = 0; i < j1.getPalabra().length; i++) {
            if (j1.getLetraIngresada().equals(j1.getPalabra()[i])) {
                conter++;

            }

        }

        if (conter > 0) {
            System.out.println("la letra se encontro en la palabra");

        } else {
            System.out.println("la letra NO se encontro en la palabra");
        }

    }

    public boolean encontradas(Ahorcado j1) {
        int conter = 0;
        boolean respuesta = false;
        for (int i = 0; i < j1.getPalabra().length; i++) {
            if (j1.getLetraIngresada().equals(j1.getPalabra()[i])) {
                conter++;

                j1.setLetrasEcontradas(j1.getLetrasEcontradas() + 1);

            }

        }

        if (conter > 0) {
            respuesta = true;

        }

        return respuesta;

    }

    public void intentos(Ahorcado j1) {

        if (!encontradas(j1)) {
            j1.setJugadasMax(j1.getJugadasMax() - 1);

        }

        System.out.println("le quedan " + j1.getJugadasMax() + " intentos");

    }

    public void juego(Ahorcado j1) {
        crearJuego(j1);
        longitud(j1);

        do {
            buscar(j1);
            intentos(j1);
            System.out.println("se ha encontrado un total de  " + j1.getLetrasEcontradas() + " letra(s)");

        } while ((j1.getJugadasMax() > 0) && (j1.getLetrasEcontradas() < j1.getPalabra().length));

        if (j1.getJugadasMax() == 0) {
            System.out.println("SE TERMINARON SUS INTENTOS");

        } else {

            System.out.println("HA COMPLETADO LA PALABRA");
        }

    }

}
