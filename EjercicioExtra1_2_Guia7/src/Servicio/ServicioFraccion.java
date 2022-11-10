/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioFraccion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarDatos(Fraccion f1) {
        System.out.println("Ingrese el 1er numerador");
        f1.setNume1(leer.nextDouble());
        System.out.println("Ingrese el 1er denominador");
        f1.setDeno1(leer.nextDouble());
        System.out.println("Ingrese el 2do numerador");
        f1.setNume2(leer.nextDouble());
        System.out.println("Ingrese el 2do denominador");
        f1.setDeno2(leer.nextDouble());

    }

    public void sumar(Fraccion f1) {
        double resultado=0;
        String nGuardado;
         String tunc;
         int cont=0;
        if (f1.getDeno1() == f1.getDeno2()) {
            resultado=(f1.getNume1() + f1.getNume2())/ f1.getDeno1();
        } else {

            resultado= ((f1.getNume1() * f1.getDeno2()) + (f1.getNume2() * f1.getDeno1())) / (f1.getDeno1() * f1.getDeno2());

        }
        System.out.println(resultado);
        for(double i=1; i<=100; i++){
                 
                for(double j=1; j<=100; j++){
                        
                        
                        tunc = String.format("%.2f", i / j);
                        nGuardado = String.format("%.2f", resultado);
                        
                        
                        if(!tunc.equals(nGuardado))
                        { tunc = String.format("%.2f", ((i / j) - 0.01));}
                        
                    if (cont==0) {
                         if(nGuardado.equals(tunc) )
                         {    System.out.println(i + "/" + j);
                         cont++;}
                    }
                       
                        
                                
                        
                }
                 
         }

    }

    public void restar(Fraccion f1) {
        double resultado=0;
        String nGuardado;
         String tunc;
         int cont=0;
        if (f1.getDeno1() == f1.getDeno2()) {
            resultado=(f1.getNume1() - f1.getNume2())/ f1.getDeno1();
        } else {

            resultado= ((f1.getNume1() * f1.getDeno2()) - (f1.getNume2() * f1.getDeno1())) / (f1.getDeno1() * f1.getDeno2());

        }
        System.out.println(resultado);
        for(double i=-100; i<=100; i++){
                 
                for(double j=-100; j<=100; j++){
                        
                        
                        tunc = String.format("%.2f", i / j);
                        nGuardado = String.format("%.2f", resultado);
                        
                        
                        if(!tunc.equals(nGuardado))
                        { tunc = String.format("%.2f", ((i / j) - 0.01));}
                        
                    if (cont==0) {
                         if(nGuardado.equals(tunc) )
                         {    System.out.println(i + "/" + j);
                         cont++;}
                    }
                       
                        
                                
                        
                }
                 
         }

    }

    public void multiplicar(Fraccion f1) {
        System.out.println("El resultado de la multiplicación es: " + (f1.getNume1() * f1.getNume2())+ "/ "+(f1.getDeno1() * f1.getDeno2()));

    }

    public void dividir(Fraccion f1) {
        System.out.println("El resultado de la division es: " + (f1.getNume1() * f1.getDeno2())+ "/ "+(f1.getDeno1() * f1.getNume2()));

    }

    public void calculadoraFraccion(Fraccion f1) {
        int opcion = 0;
        llenarDatos(f1);
        do {
            System.out.println("MENÚ");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - SALIR");
            System.out.println("INGRESE UNA OPCIÓN");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    sumar(f1);

                    break;
                case 2:
                    restar(f1);
                    break;
                case 3:
                    multiplicar(f1);
                    break;
                case 4:
                    dividir(f1);
                    break;
                    case 5:
                        System.out.println("HASTA LUEGO");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 5);

    }

}
