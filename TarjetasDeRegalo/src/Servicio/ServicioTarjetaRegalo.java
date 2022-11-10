/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.TarjetaRegalo;

/**
 *
 * @author pittu
 */
public class ServicioTarjetaRegalo {

    TarjetaRegalo t1 = new TarjetaRegalo();

    public void crearCodigo(TarjetaRegalo t1) {
        double cincoDigitos = 10000 + Math.random() * 90000;
        t1.setCodigo((int) cincoDigitos);

    }

    public double gastando(TarjetaRegalo t1, double gastado) {
               
        double resultado = t1.getSaldo() - gastado;
        t1.setSaldo(resultado);

        return t1.getSaldo();

    }
    
    public void gastar(TarjetaRegalo t1, double gastado){
        if (gastado>t1.getSaldo()) {
            System.out.println("No tiene saldo suficiente");
        } else{
        gastando(t1, gastado);
        
        }
    
    
    }
    
    public double fusionar(TarjetaRegalo t1,TarjetaRegalo t2){
    double nuevoSaldo=t1.getSaldo()+t2.getSaldo();
    t1.setSaldo(0);
    t2.setSaldo(0);
    
    return nuevoSaldo;
    }

}
