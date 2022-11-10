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

public class TarjetaRegalo {
    private double saldo;
    private int codigo;

    public TarjetaRegalo() {
        
    }

    public TarjetaRegalo(double saldo, int codigo) {
        this.saldo = saldo;
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Override
    public String toString() {
        return "TarjetaRegalo{" + "saldo=" + saldo + ", codigo=" + codigo + '}';
    }
    

}
