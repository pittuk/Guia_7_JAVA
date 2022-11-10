/*
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada
fracción). Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir
fracciones. Mostrar por pantalla un menú de opciones para que el usuario decida que ver.
 */

package ejercicio1extra2_guia7;

//@author pittu

import Entidad.Fraccion;
import Servicio.ServicioFraccion;


public class Principal {

    public static void main(String[] args) {
        Fraccion f1=new Fraccion();
        ServicioFraccion accion=new ServicioFraccion();
        
accion.calculadoraFraccion(f1);
        
        
        
    }

}
