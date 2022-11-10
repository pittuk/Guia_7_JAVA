/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Auto;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioAuto {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void cargarFicha(Auto a1) {

        System.out.println("Ingrese su nombre");
        a1.setNombreD(leer.next());
        System.out.println("Fecha de vecimiento del carnet");
        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año");
        int anio = leer.nextInt();
        Date fechaIngresada = new Date(anio - 1900, mes - 1, dia);
        a1.setFechaVC(fechaIngresada);
        System.out.println("Ingrese el color del vehiculo");
        a1.setColorV(leer.next());
        System.out.println("Ingrese el modelo del vehículo");
        a1.setModeloV(leer.next());
        

    }

    public void modificarT(Auto a1) {
        System.out.println("El titular actual es: " + a1.getNombreD());
        System.out.println("---------------------");
        System.out.println("Ingrese 'E' para editar el titular o 'S' para salir al menú principal");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        String newNombre = "";
        do {
            switch (opcion) {
                case "E":
                    System.out.println("Ingrese el nombre del nuevo titular");
                    newNombre = leer.next();
                    a1.setNombreD(newNombre);
                    break;
                case "S":
                    break;
                default:
                    opcion = "S";
                    break;
            }
        } while (!opcion.equals("S") && !newNombre.equals(a1.getNombreD()));

        if (opcion.equals("E")) {
            System.out.println("---------------------");
            System.out.println("El nuevo titular es: " + a1.getNombreD());
        }

    }

    public void actualizarT(Auto a1) {
        System.out.println("Ingrese el trayecto recorrido en KM");
        int trayectoR = leer.nextInt();
        a1.setKmM(trayectoR + a1.getKmM());
        System.out.println("---------------------");
        System.out.println("El kilometraje actual es: " + a1.getKmM());

    }

    public void servicioV(Auto a1) {
        if (a1.getKmM() < 10000) {
            System.out.println("El kilometraje actual es: " + a1.getKmM() + ", todavía no corresponde el Service");

        } else {
            System.out.println("El kilometraje actual es: " + a1.getKmM() + ", debe hacer Service");
        }

    }

    public void mostrar(Auto a1) {
        System.out.println("Titular: " + a1.getNombreD());
        System.out.println("Fecha de vencimiento del carnet: " + a1.getFechaVC());
        System.out.println("Color vehículo: " + a1.getColorV());
        System.out.println("Modelo Vehículo: " + a1.getModeloV());
        System.out.println("Kilometraje Vehículo: " + a1.getKmM());

    }

    public void menu(Auto a1) {
        int opcion;
        do {
            System.out.println("\tMenu ");

            System.out.println("1 - Modificar Titularidad del vechículo");
            System.out.println("2 - Indicar trayecto recorrido");
            System.out.println("3 - Ver si toca Service");
            System.out.println("4 - Mostra todos los datos");
            System.out.println("5 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:
                    modificarT(a1);
                    break;
                case 2:
                    actualizarT(a1);
                    break;
                case 3:
                    servicioV(a1);
                    break;
                case 4:
                    mostrar(a1);
                    break;
                case 5:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 5));

    }

}
