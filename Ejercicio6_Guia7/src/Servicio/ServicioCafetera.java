/*Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioCafetera {

    Scanner leer = new Scanner(System.in);

    public Cafetera llenarCafetera(Cafetera C1) {
        
        C1.setCantidadActual(C1.getCapacidadMaxima());

       

        return C1;
    }

    public void servirTaza(Cafetera C1) {
        int tamanioTaza;
        System.out.println("Ingrese el tañano de la taza en ml");
        tamanioTaza = leer.nextInt();

        if (tamanioTaza < C1.getCantidadActual()) {
            C1.setCantidadActual(C1.getCantidadActual() - tamanioTaza);
            System.out.println("Le Servimos una taza de: " + tamanioTaza + " ml");
            System.out.println("El nivel actual de la cafetera es: " + C1.getCantidadActual() + " ml");

        } else {
            System.out.println("No hay suficiente cafe para llenar su taza, le servimos solos " + C1.getCantidadActual());
            C1.setCantidadActual(0);
            System.out.println("La cafetera esta al nivel: " + C1.getCantidadActual() + " DEBE LLENARLA PRONTO");

        }

    }

    public void vaciarCafetera(Cafetera C1) {
        System.out.println("La cafetera esta al nivel: " + C1.getCantidadActual() + " ml, procederemos a vaciar la cafetera");
        C1.setCantidadActual(0);
        System.out.println("la cafetera esta vacia: " + C1.getCantidadActual() + " ml");

    }

    public void agregarCafe(Cafetera C1) {
        int cantidadCafe;
        System.out.println("Ingrese la cantidad de cafe que desea agregar en ml");
        cantidadCafe = leer.nextInt();

        if ((cantidadCafe + C1.getCantidadActual()) < C1.getCapacidadMaxima()) {
            C1.setCantidadActual(cantidadCafe + C1.getCantidadActual());
            System.out.println("El nivel actual de la cafetera es: " + C1.getCantidadActual() + " ml");

        } else {
            System.out.println("No hay espacio para tanto cafe, solo puede agregar: " + (C1.getCapacidadMaxima() - C1.getCantidadActual()));

        }

    }

    public void menuCafetera(Cafetera C1) {
        ServicioCafetera accion=new ServicioCafetera();
        
        int opcion;

        do {
            System.out.println("\tNespresso");
            System.out.println("1-Llenar cafetera");
            System.out.println("2-Servir Taza");
            System.out.println("3-Vaciar cafetera");
            System.out.println("4-Agregar Cafe");
            System.out.println("5-SALIR");

            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                   accion.llenarCafetera(C1);
                    System.out.println("La Cafetera esta llena " + C1.getCantidadActual());

                    break;
                case 2:
                    accion.servirTaza(C1);

                    break;
                case 3:
                    accion.vaciarCafetera(C1);

                    break;
                case 4:
                    accion.agregarCafe(C1);
                    break;

                default:
                    if (opcion != 5) {
                        System.out.println("Opción no valida");
                    }

            }
        } while (opcion != 5);

    }

}
