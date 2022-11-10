/*Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
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
package ejercicio5;

//@author pittu
import Entidad.Cuenta;
import Servicio.ServicioCuenta;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        ServicioCuenta accion = new ServicioCuenta();

        Cuenta C1 = accion.crearCuenta();
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("\tMENÚ");
            System.out.println("1-Depositar");
            System.out.println("2-Retirar");
            System.out.println("3-Retiro Rápido");
            System.out.println("4-Consultar Saldo");
            System.out.println("5-Consultar datos");
            System.out.println("6-SALIR");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    accion.ingresar(C1);

                    break;
                case 2:
                    accion.retirar(C1);

                    break;
                case 3:
                    accion.extraccionRapida(C1);

                    break;
                case 4:
                    accion.consultarSaldo(C1);
                    break;
                case 5:
                    accion.consultarDatos(C1);

                    break;

                default:
                    if (opcion!=6) {
                        System.out.println("Opción no valida");
                    }
                    
            }
        } while (opcion != 6);

    }

}
