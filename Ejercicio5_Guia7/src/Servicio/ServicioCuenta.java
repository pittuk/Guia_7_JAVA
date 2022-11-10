/*/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author pittu
 */
public class ServicioCuenta {
    
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        
        Cuenta C1 = new Cuenta();
        System.out.println("Ingrese Numero de cuenta");
        C1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese su DNI");
        C1.setDni(leer.nextInt());
        
        System.out.println("Ingrese saldo actual");
        C1.setSaldoActual(leer.nextDouble());
        
        return C1;
        
    }
    
    public void ingresar(Cuenta C1) {
        System.out.println("Ingrese el monto");
        C1.setSaldoActual(leer.nextDouble() + C1.getSaldoActual());
        System.out.println(C1.getSaldoActual());
    }
    
    public void retirar(Cuenta C1) {
        System.out.println("Ingrese monto a retirar");
        double saldoRetirar = leer.nextDouble();
        if (C1.getSaldoActual() - saldoRetirar < 0) {
            
            C1.setSaldoActual(0);
            
        } else {
            C1.setSaldoActual(C1.getSaldoActual() - saldoRetirar);
            
        }
        
    }
    
    public void extraccionRapida(Cuenta C1) {
        System.out.println("Ingrese la cantidad a retirar");
        double saldoRapido = leer.nextDouble();
        if (saldoRapido > C1.getSaldoActual() * 0.2 ) {
            System.out.println("No es posible retirar mas del 20%"); 
            
        } else{
        C1.setSaldoActual(C1.getSaldoActual() - saldoRapido);
                   
        }
        
    }
    
    public void consultarSaldo(Cuenta C1){
        System.out.println("Su saldo actual es "+ C1.getSaldoActual());
    
    
    }
    
    public void consultarDatos(Cuenta C1){
        System.out.println("Numero de cuenta: " + C1.getNumeroCuenta());
        System.out.println("DNI: "+ C1.getDni());
        System.out.println("Saldo Actual: " + C1.getSaldoActual());
    
    }
    
}
