package Servicio;

import Entidad.VentaEntradas;
import java.util.Scanner;

public class ServicioVentaEntradas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void menu(VentaEntradas v1) {
        int opcion;
        do {
            System.out.println("");
            System.out.println("\tVENTA DE ENTRADAS ");
            System.out.println("1 - Mostra Numero de entradas libres");
            System.out.println("2 - Comprar entradas");
            System.out.println("3 - Salir");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:

                    mostrarEntradasLibres(v1);
                    break;
                case 2:
                    venderEntradas(v1);
                    break;

                case 3:
                    System.out.println("Hasta Luego...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 3));

    }

    public void mostrarEntradasLibres(VentaEntradas v1) {
        System.out.println("Quedan " + v1.getSalaPrincipal() + " entradas en Sala Principal, " + v1.getCompraVenta() + " entradas en Compra-Venta y " + v1.getVip() + " entrada en VIP");
        v1.setEntradasPorVender((v1.getSalaPrincipal() + v1.getCompraVenta() + v1.getVip()));
        System.out.println("En total " + v1.getEntradasPorVender() + " entradas por vender");

    }

    public void venderEntradas(VentaEntradas v1) {
        int opcion;
        int n;
        System.out.println("Ingrese la cantidad de entrada a comprar");
        n = leer.nextInt();
        do {
            System.out.println("");
            System.out.println("\nELIGE UNA ZONA ");
            System.out.println("1 - Sala Principal");
            System.out.println("2 - Compra-Venta");
            System.out.println("3 - VIP");
            System.out.println("4 - SALIR");
            System.out.println("Elija su opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    if (v1.getSalaPrincipal() >= n) {
                        v1.setSalaPrincipal(v1.getSalaPrincipal() - n);
                        System.out.println("Se le vendieron " + n + " entradas en Sala Principal ¡GRACIAS!");
                        v1.setEntradasVendidas(v1.getEntradasVendidas() + n);

                    } else {
                        System.out.println("Lo siento, Solo quedan " + v1.getSalaPrincipal() + " entradas en Sala Principal");

                    }

                    break;
                case 2:
                    if (v1.getCompraVenta() >= n) {
                        v1.setCompraVenta(v1.getCompraVenta() - n);
                        System.out.println("Se le vendieron " + n + " entradas en Compra-Venta ¡GRACIAS!");
                        v1.setEntradasVendidas(v1.getEntradasVendidas() + n);

                    } else {
                        System.out.println("Lo siento, Solo quedan " + v1.getCompraVenta() + " entradas en Compra-Venta");

                    }

                    break;
                case 3:
                    if (v1.getVip()>= n) {
                        v1.setVip(v1.getVip() - n);
                        System.out.println("Se le vendieron " + n + " entradas VIP ¡GRACIAS!");
                        v1.setEntradasVendidas(v1.getEntradasVendidas() + n);

                    } else {
                        System.out.println("Lo siento, Solo quedan " + v1.getVip() + " entradas en VIP");

                    }
                    break;

                case 4:
                    System.out.println("Gracias por comprar...");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida, vuelva a intentar...");
                    break;
            }
        } while (!(opcion == 4) && (v1.getEntradasPorVender() - v1.getEntradasVendidas() == n));

    }

}
