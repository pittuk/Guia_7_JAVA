/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author pittu
 */
public class Fraccion {
    private double nume1;
    private double deno1;
    private double nume2;
    private double deno2;

    public Fraccion() {
    }

    public Fraccion(double nume1, double deno1, double nume2, double deno2) {
        this.nume1 = nume1;
        this.deno1 = deno1;
        this.nume2 = nume2;
        this.deno2 = deno2;
    }

    public double getNume1() {
        return nume1;
    }

    public void setNume1(double nume1) {
        this.nume1 = nume1;
    }

    public double getDeno1() {
        return deno1;
    }

    public void setDeno1(double deno1) {
        this.deno1 = deno1;
    }

    public double getNume2() {
        return nume2;
    }

    public void setNume2(double nume2) {
        this.nume2 = nume2;
    }

    public double getDeno2() {
        return deno2;
    }

    public void setDeno2(double deno2) {
        this.deno2 = deno2;
    }

  
    
}
