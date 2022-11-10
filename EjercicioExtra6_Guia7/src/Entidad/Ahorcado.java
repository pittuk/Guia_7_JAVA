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
public class Ahorcado {

    private String[] palabra;
    private String[] palabraLlena;
    private int letrasEcontradas;
    private int jugadasMax;
    private String letraIngresada;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraLlena, int letrasEcontradas, int jugadasMax, String letraIngresada) {
        this.palabra = palabra;
        this.palabraLlena = palabraLlena;
        this.letrasEcontradas = letrasEcontradas;
        this.jugadasMax = jugadasMax;
        this.letraIngresada = letraIngresada;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraLlena() {
        return palabraLlena;
    }

    public void setPalabraLlena(String[] palabraLlena) {
        this.palabraLlena = palabraLlena;
    }

    public int getLetrasEcontradas() {
        return letrasEcontradas;
    }

    public void setLetrasEcontradas(int letrasEcontradas) {
        this.letrasEcontradas = letrasEcontradas;
    }

    public int getJugadasMax() {
        return jugadasMax;
    }

    public void setJugadasMax(int jugadasMax) {
        this.jugadasMax = jugadasMax;
    }

    public String getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(String letraIngresada) {
        this.letraIngresada = letraIngresada;
    }
    

}
