/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pass;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioPass {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /* public void ingresarDatos(Pass p1) {
        p1.setNombre("Luis");
        p1.setDni(95447827);

    }*/
    public void crearPass(Pass p1) {

        System.out.println("Ingrese una contraseña");
        String passIngresado = leer.next();
        while (passIngresado.length() != 10) {
            System.out.println("Ingrese una contraseña de 10 caracteres");
            passIngresado = leer.next();

        }
        p1.setPass(passIngresado);

    }

    public void analizarPass(Pass p1) {
        String[] passVector = new String[p1.getPass().length()];
        passVector = p1.getPass().split("");
        int contA = 0, contZ = 0;

        for (int i = 0; i < p1.getPass().length(); i++) {
            if (passVector[i].contains("z")) {
                contZ++;

            } else if (passVector[i].contains("a")) {
                contA++;

            }

        }

        if (contZ >= 1) {
            System.out.println("Su contraseña es nivel MEDIO");

        } else if (contZ >= 1 && contA >= 2) {
            System.out.println("Su contraseña es nivel ALTO");

        } else {
            System.out.println("Su contraseña es nivel BAJO");
        }

    }

    public void modificarNombre(Pass p1) {

        System.out.println("Por favor ingrese su contraseña");
        String passIngresado = leer.next();
        while (!passIngresado.equals(p1.getPass())) {
            System.out.println("Por favor ingrese una contraseña correcta");
            passIngresado = leer.next();

        }

        System.out.println("Ingrese su nuevo nombre");
        p1.setNombre(leer.next());

        System.out.println("Su nombre ha sido actualizado");

    }

    public void modificarDni(Pass p1) {

        System.out.println("Por favor ingrese su contraseña");
        String passIngresado = leer.next();
        while (!passIngresado.equals(p1.getPass())) {
            System.out.println("Por favor ingrese una contraseña correcta");
            passIngresado = leer.next();

        }

        System.out.println("Ingrese su nuevo DNI");
        p1.setDni(leer.nextInt());

        System.out.println("Su DNI ha sido actualizado");

    }

    public void modificarPass(Pass p1) {

        System.out.println("Por favor ingrese su contraseña");
        String passIngresado = leer.next();
        while (!passIngresado.equals(p1.getPass())) {
            System.out.println("Por favor ingrese una contraseña correcta");
            passIngresado = leer.next();

        }

        crearPass(p1);

    }
    
    public void mostrarDatos(Pass p1){
        System.out.println("Nombre: "+ p1.getNombre());
        System.out.println("DNI: "+ p1.getDni());
    
    }

    public void menu(Pass p1) {
        String opcion;
        // ingresarDatos(p1);

        do {

            System.out.println("MENÚ");
            System.out.println("A - Crear contraseña");
            System.out.println("B - Nivel de contraseña");
            System.out.println("C - Modificar contraseña");
            System.out.println("D - Modificar nombre");
            System.out.println("E - Modificar DNI");
            System.out.println("F - Mostrar Datos");
            System.out.println("S - SALIR");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = leer.next().toUpperCase();

            switch (opcion) {
                case "A":
                    crearPass(p1);

                    break;
                case "B":
                    analizarPass(p1);

                    break;
                case "C":
                    modificarPass(p1);

                    break;
                case "D":
                    modificarNombre(p1);

                    break;
                case "E":
                    modificarDni(p1);

                    break;
                    case "F":
                    mostrarDatos(p1);

                    break;
                case "S":
                    System.out.println("HASTA LUEGO");

                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (!opcion.equals("S"));

    }

}
