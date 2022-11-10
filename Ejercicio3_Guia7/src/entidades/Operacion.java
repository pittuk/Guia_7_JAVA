/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class Operacion {

    private double numero1;
    private double numero2;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //METODOS MIOS
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        setNumero1(leer.nextDouble());
        System.out.println("Ingrese el numero 2");
        setNumero2(leer.nextDouble());

    }

    public double suma() {
        double resulSuma;
        resulSuma = numero1 + numero2;
        return resulSuma;

    }

    public double resta() {
        double resulResta;
        resulResta = numero1 - numero2;
        return resulResta;

    }

    public void multiplicar() {
        double resulMulti = 0;

        if (numero1 == 0 || numero2 == 0) {
            resulMulti = 0;
            System.out.println("ERROR, el resultado es " + resulMulti);

        } else {
            System.out.println(numero1 * numero2); 

        }
        
    }  

    public void dividir() {
        double resulDivi = 0;

        if (numero1 == 0 || numero2 == 0) {
            resulDivi = 0;
            System.out.println("ERROR, el resultado es " + resulDivi);

        } else {
            System.out.println(numero1 / numero2);

        }

    }

}
