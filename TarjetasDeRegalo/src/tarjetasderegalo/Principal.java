package tarjetasderegalo;

//@author pittu
import Entidad.TarjetaRegalo;
import Servicio.ServicioTarjetaRegalo;

public class Principal {

    public static void main(String[] args) {
ServicioTarjetaRegalo accion= new ServicioTarjetaRegalo();
        TarjetaRegalo t1 = new TarjetaRegalo();
        TarjetaRegalo t2 = new TarjetaRegalo();
        
        
        t1.setSaldo(100);
        t2.setSaldo(120);
        
        
        accion.crearCodigo(t1);
        accion.crearCodigo(t2);
        
        System.out.println("Tarjeta n° " + t1.getCodigo() + " - Saldo "+t1.getSaldo()+"$");
        System.out.println("----------------------");
        System.out.println("Tarjeta n° " + t2.getCodigo() + " - Saldo "+t2.getSaldo()+"$");
        System.out.println("----------------------");
        accion.gastar(t1, 200);
        accion.gastar(t2, 5);
        
        
        System.out.println("Tarjeta n° " + t1.getCodigo() + " - Saldo "+t1.getSaldo()+"$");
        System.out.println("----------------------");
        System.out.println("Tarjeta n° " + t2.getCodigo() + " - Saldo "+t2.getSaldo()+"$");
        System.out.println("----------------------");
        
        
        TarjetaRegalo t3 = new TarjetaRegalo();
        accion.crearCodigo(t3);
        t3.setSaldo(accion.fusionar(t1, t2));
        
        System.out.println("Tarjeta n° " + t3.getCodigo() + " - Saldo "+t3.getSaldo()+"$");
        System.out.println("----------------------");
        System.out.println("Tarjeta n° " + t1.getCodigo() + " - Saldo "+t1.getSaldo()+"$");
        System.out.println("----------------------");
        System.out.println("Tarjeta n° " + t2.getCodigo() + " - Saldo "+t2.getSaldo()+"$");
        System.out.println("----------------------");
        
        
        
        

    }

}
