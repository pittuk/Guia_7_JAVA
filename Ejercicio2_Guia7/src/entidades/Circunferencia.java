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
public class Circunferencia {
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el radio");
        setRadio(leer.nextDouble());
        
                
     }
    
    public void area(){
        double areaCircun;
        areaCircun=(Math.PI)*(radio*radio);
        System.out.println("El area de la circunferencia es "+areaCircun);
    }
    public void perimetro(){
        double periCircun;
       periCircun=2*(Math.PI)*radio;
    System.out.println("El perimetro de la circunferencia es "+ periCircun);
    
    }
    
}
