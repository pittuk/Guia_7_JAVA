/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioNIF {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearNIF(NIF n1) {

        String[] vector = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.println("Ingrese el numero de DNI");
        n1.setDNI(leer.nextInt());
        int restoDNI = n1.getDNI() % 23;
        n1.setLetra(vector[restoDNI]);
        System.out.println("La letra que le corresponde es: " + n1.getLetra());

    }

    public void mostrar(NIF n1) {
        String formato = String.format("%08d", n1.getDNI());
        System.out.println("El NIF es " + formato + "-" + n1.getLetra());
       /*  float pi = 3.14159265359f;

       String resultado2 = String.format("%f  Decimales: %.2f ", pi, pi);
        System.out.println(resultado2);*/


    }

}
