package ejercicio7_guia7;

//@author pittu
import Entidad.Persona;
import Servicio.ServicioPersona;

public class Ejercicio7_Guia7 {

    public static void main(String[] args) {

        Persona P1 = new Persona();
        Persona P2 = new Persona();
        Persona P3 = new Persona();
        Persona P4 = new Persona();

        ServicioPersona accion = new ServicioPersona();
        int contaBajo = 0, contaBien = 0, contaAlto = 0, contaMenor = 0, contaMayor = 0;

        //  PERSONA 1
        accion.CrearPersona(P1);

        if (accion.calcularIMC(P1) == -1) {
            System.out.println("Estas por debajo del peso");
            contaBajo++;
        } else if (accion.calcularIMC(P1) == 0) {
            System.out.println("Esta en el peso promedio");
            contaBien++;
        } else if (accion.calcularIMC(P1) == 1) {
            System.out.println("Estas por arriba del peso");
            contaAlto++;
        }
        if (accion.esMayorDeEdad(P1) == true) {
            System.out.println("Es mayor de edad");
            contaMayor++;
        } else {
            System.out.println("Es menor de edad");
            contaMenor++;
        }
        System.out.println("====================================");
        //  PERSONA 2
        accion.CrearPersona(P2);

        if (accion.calcularIMC(P2) == -1) {
            System.out.println("Estas por debajo del peso");
            contaBajo++;
        } else if (accion.calcularIMC(P2) == 0) {
            System.out.println("Esta en el peso promedio");
            contaBien++;
        } else if (accion.calcularIMC(P2) == 1) {
            System.out.println("Estas por arriba del peso");
            contaAlto++;
        }
        if (accion.esMayorDeEdad(P2) == true) {
            System.out.println("Es mayor de edad");
            contaMayor++;
        } else {
            System.out.println("Es menor de edad");
            contaMenor++;
        }
        System.out.println("====================================");
        //  PERSONA 3
        accion.CrearPersona(P3);

        if (accion.calcularIMC(P3) == -1) {
            System.out.println("Estas por debajo del peso");
            contaBajo++;
        } else if (accion.calcularIMC(P3) == 0) {
            System.out.println("Esta en el peso promedio");
            contaBien++;
        } else if (accion.calcularIMC(P3) == 1) {
            System.out.println("Estas por arriba del peso");
            contaAlto++;
        }
        if (accion.esMayorDeEdad(P3) == true) {
            System.out.println("Es mayor de edad");
            contaMayor++;
        } else {
            System.out.println("Es menor de edad");
            contaMenor++;
        }
        System.out.println("====================================");
        //  PERSONA 4
        accion.CrearPersona(P4);

        if (accion.calcularIMC(P4) == -1) {
            System.out.println("Estas por debajo del peso");
            contaBajo++;
        } else if (accion.calcularIMC(P4) == 0) {
            System.out.println("Esta en el peso promedio");
            contaBien++;
        } else if (accion.calcularIMC(P4) == 1) {
            System.out.println("Estas por arriba del peso");
            contaAlto++;
        }
        if (accion.esMayorDeEdad(P4) == true) {
            System.out.println("Es mayor de edad");
            contaMayor++;
        } else {
            System.out.println("Es menor de edad");
            contaMenor++;
        }

        System.out.println("====================================");
        System.out.println("El " + (100 * contaBajo / 4) + "% está por debajo de su peso");
        System.out.println("El " + (100 * contaAlto / 4) + "% está por encima de su peso");
        System.out.println("El " + (100 * contaBien / 4) + "% está bien de peso");
        System.out.println("====================================");
        System.out.println("El " + (100 * contaMayor) / 4 + "% es mayorde edad");
        System.out.println("El " + (100 * contaMenor) / 4 + "% es menor de edad");

    }

}
