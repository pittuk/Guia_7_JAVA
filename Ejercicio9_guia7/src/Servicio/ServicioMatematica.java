/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author pittu
 */
public class ServicioMatematica {

    public void devolverMayor(Matematica m1) {

        if (m1.getNumero1() == m1.getNumero2()) {
            System.out.println("los numero son iguales");

        } else if (m1.getNumero1() > m1.getNumero2()) {
            System.out.println("el numero " + m1.getNumero1() + " es mayor");

        } else {
            System.out.println("el numero " + m1.getNumero2() + " es mayor");
        }

    }

    public void calcularPotencia(Matematica m1) {

        double potencia, numero1, numero2;
        numero1 = Math.round(m1.getNumero1());
        numero2 = Math.round(m1.getNumero2());
        
        System.out.println(numero1);
         System.out.println(numero2);

        if (numero1 > numero2) {
            potencia = Math.pow(numero1, numero2);

        } else {
            potencia = Math.pow(numero2, numero1);

        }

        System.out.println("la potencia es " + potencia);

    }

    public void calculaRaiz(Matematica m1) {
        double raiz, numero1, numero2;
        numero1 = Math.round(m1.getNumero1());
        numero2 = Math.round(m1.getNumero2());

        if (numero1 > numero2) {
            raiz = Math.sqrt(numero2);

            System.out.println("la raiz cuadrada de " + numero2 + " es: " + raiz);

        } else {
            raiz = Math.sqrt(numero1);
            System.out.println("la raiz cuadrada de " + numero1 + " es: " + raiz);

        }

    }

}
