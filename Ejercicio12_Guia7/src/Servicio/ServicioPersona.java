/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioPersona {

    Date fechaAtual = new Date();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearPersona(Persona p1) {

        System.out.println("Ingrse el nombre");
        p1.setNombre(leer.next());
        System.out.println("Ingrese año de nacimiento, ejemplo '1978'");
        int anio = leer.nextInt();
        System.out.println("Ingrese mes de nacimiento, ejemplo '08'");
        int mes = leer.nextInt();
        System.out.println("Ingrese día de nacimiento, ejemplo '26'");
        int dia = leer.nextInt();
        Date fechaIngresada = new Date(anio-1900, mes-1, dia);
        p1.setFecha(fechaIngresada);

    }

    public void calcularEdad(Persona p1) {

        int edadPersona = fechaAtual.getYear() - p1.getFecha().getYear();
        System.out.println("La edad de la persona es " + edadPersona);

    }

    public boolean menorQue(Persona p1) {
        boolean menor = false;
        int edadPersona = fechaAtual.getYear() - p1.getFecha().getYear();
        System.out.println("Ingrese una edad para comparar");
        int edadNueva = leer.nextInt();

        if (edadNueva < edadPersona) {
            menor = true;
        }

        return menor;
    }
    
    public void mostrarPersona(Persona p1){
        
        Date fechaAtual = new Date();
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Fecha de nacimiento: " + p1.getFecha());
        System.out.println("Edad: " +(fechaAtual.getYear() - p1.getFecha().getYear()));
    
    
    
    
    }

}
