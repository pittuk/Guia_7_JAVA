/*
Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
• Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
• Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
• Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles
soluciones.
• Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es
en el caso en que se tenga una única solución posible.
• Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioRaices {

    Scanner leer = new Scanner(System.in);

    public void llenarDatos(Raices r1) {
        System.out.println("Ingrese el valor de 'a'");
        r1.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de 'b'");
        r1.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de 'c'");
        r1.setC(leer.nextDouble());

        System.out.println("a: " + r1.getA());
        System.out.println("b: " + r1.getB());
        System.out.println("c: " + r1.getC());

    }

    public double getDiscriminante(Raices r1) {

        return (Math.pow(r1.getB(), 2)) - (4 * r1.getA() * r1.getC());
    }

    public boolean tieneRaices(Raices r1) {

        return getDiscriminante(r1) > 0;
    }

    public boolean tieneRaiz(Raices r1) {

        return getDiscriminante(r1) == 0;
    }

    public void obtenerRaices(Raices r1) {
        if (tieneRaices(r1)) {
            double solucion = ((-r1.getB()) + (Math.sqrt(getDiscriminante(r1)))) / 2 * r1.getA();
            System.out.println("La solucion 1 es: " + solucion);
            solucion = ((-r1.getB()) - (Math.sqrt(getDiscriminante(r1)))) / 2 * r1.getA();
            System.out.println("La solucion 2 es: " + solucion);

        }

    }

    public void obtenerRaiz(Raices r1) {
        if (tieneRaiz(r1)) {
            double solucion = (-r1.getB()) + (Math.sqrt(getDiscriminante(r1)));
            System.out.println("La solucion es: " + solucion);

        }

    }

    public void calcular(Raices r1) {
        if (getDiscriminante(r1) < 0) {
            System.out.println("No tiene raices");

        } else if (tieneRaices(r1)) {
            obtenerRaices(r1);

        } else if (tieneRaiz(r1)) {
            obtenerRaiz(r1);

        }

    }

}
