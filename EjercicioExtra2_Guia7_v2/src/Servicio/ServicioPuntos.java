/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioPuntos {

    Scanner leer = new Scanner(System.in);

    public Puntos crearPuntos() {
        Puntos p1 = new Puntos();
        System.out.println("ingrese punto x1");
        p1.setX1(leer.nextDouble());
        System.out.println("ingrese punto y1");
        p1.setY1(leer.nextDouble());
        System.out.println("ingrese punto x2");
        p1.setX2(leer.nextDouble());
        System.out.println("ingrese punto y2");
        p1.setY2(leer.nextDouble());

        return p1;
    }

    public double calcularDistancia(Puntos p1) {
        return Math.sqrt(Math.pow(p1.getX2() - p1.getX1(), 2) + Math.pow(p1.getY2() - p1.getY1(), 2));

    }

}
