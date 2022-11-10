

package ejercicio9_guia7;

//@author pittu

import Entidad.Matematica;
import Servicio.ServicioMatematica;


public class Ejercicio9_guia7 {

    public static void main(String[] args) {
        
        Matematica m1=new Matematica();
        ServicioMatematica accion= new ServicioMatematica();
        
        m1.setNumero1(Math.random()*10);
        m1.setNumero2(Math.random()*10);
        
        System.out.println(m1.getNumero1());
        System.out.println(m1.getNumero2());
        
        accion.devolverMayor(m1);
        
        accion.calcularPotencia(m1);
        
        accion.calculaRaiz(m1);
        
        
        
        
    }

}
