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
    Scanner leer=new Scanner (System.in);
    
    public void crearPuntos(Puntos p1){
        System.out.println("Ingrese 1er valor del punto 1 'x1'");
        p1.setX1(leer.nextDouble());
        System.out.println("Ingrese 2do valor del punto 1 'y1'");
        p1.setY1(leer.nextDouble());
        System.out.println("Ingrese 1er valor del punto 2 'x2'");
        p1.setX2(leer.nextDouble());
        System.out.println("Ingrese 2do valor del punto 2 'y2'");
        p1.setY2(leer.nextDouble());
    
    
    
    }
    
    
    public double calcularDistancia(Puntos p1){
    double distancia= Math.sqrt(Math.pow(p1.getX2()-p1.getX1(), 2)+ Math.pow(p1.getY2()-p1.getY1(),2));
    
    
    return distancia;
    }
    
}
