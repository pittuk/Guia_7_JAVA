package ejercicio11_guia7;

//@author pittu
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio11_Guia7 {

    public static void main(String[] args) {
        Date fechaActual = new Date();
        Scanner leer = new Scanner(System.in);
        // dandole formato a la fecha
        String formato = "dd-MM-yyyy";
        SimpleDateFormat fechaSimple = new SimpleDateFormat(formato);
        String fechaSimplificada;
        

        System.out.println("Ingrese el día");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes en numeros");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año, por ejemplo: '1978'");
        int anio = leer.nextInt();
        Date fecha = new Date(anio - 1900, mes - 1, dia);

        System.out.println("la fecha actual es:");
        fechaSimplificada=fechaSimple.format(fechaActual);
        System.out.println(fechaSimplificada);

        System.out.println("la fecha ingresada es:");
        fechaSimplificada=fechaSimple.format(fecha);
        System.out.println(fechaSimplificada);

        System.out.println("hay " + (fechaActual.getYear() - fecha.getYear()) + " años de diferencia");

    }

}
