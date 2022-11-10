/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Triangulo;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioTriangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearTriangulos(Triangulo[] arrayTri) {

        //creamos el array de objetos de la clase triangulos
        
        //creamos los 3 triangulos
        for (int i = 0; i < arrayTri.length; i++) {
            System.out.println("Ingrese el lado del triangulo " + (i + 1));
            double lado = leer.nextDouble();
            System.out.println("Ingrese la base del triangulo " + (i + 1));
            double base = leer.nextDouble();

            arrayTri[i] = new Triangulo(lado, base);

        }
        for (int i = 0; i < arrayTri.length; i++) {
            System.out.println("Lado de triangulo "+ (i + 1)+": "+ arrayTri[i].getLado());
            System.out.println("Base de triangulo: "+ (i + 1)+": "+arrayTri[i].getBase());
            System.out.println("---------------------------------------------");
            
        }
        
        

    }
    
    
    public void calcularArea(Triangulo[] arrayTri){
        double h=0;
        for (int i = 0; i < arrayTri.length; i++) {
            h=Math.sqrt(Math.pow(arrayTri[i].getLado(), 2)-(Math.pow(arrayTri[i].getBase(), 2)/4));
            System.out.println("El Área del triangulo " +(i+1)+" es: "+ (arrayTri[i].getBase()*h)/2);
            System.out.println("---------------------------------------------");
            
            
        }
    
    
    
    }
    
    public void calcularPerimetro(Triangulo[] arrayTri){
        
        for (int i = 0; i < arrayTri.length; i++) {
            System.out.println("El Perimetro del triangulo " +(i+1)+" es: "+ ((2*arrayTri[i].getLado())+(arrayTri[i].getBase())));
            System.out.println("---------------------------------------------");
        }
        
        
    
    
    
    }
    
    
    
    

}


