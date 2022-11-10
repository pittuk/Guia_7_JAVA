/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void CrearPersona(Persona p) {
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese Edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese Genero");
        p.setSexo(leer.next());
        System.out.println("Ingrese peso");
        p.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        p.setAltura(leer.nextDouble());

    }

    public double calcularIMC(Persona p) {
        double indice;
        indice = p.getPeso() / Math.pow(p.getAltura(), 2);

        if (indice < 20) {
            indice = -1;
        } else if (indice >= 20 && indice <= 25) {
            indice = 0;
        } else if (indice > 25) {
            indice = 1;
        }
        return indice;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean mayorEdad = false;

        if (p.getEdad() > 18) {
            mayorEdad=true;

        } 
        return mayorEdad;

    }

}
