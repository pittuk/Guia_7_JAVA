/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package ejercicio10_guia7;

//@author pittu
import java.util.Arrays;

public class Ejercicio10_Guia7 {

    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        //llenamos el vector con numero aleatorios
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 10 + 1;
            System.out.print("[" + arregloA[i] + "]");

        }
        System.out.println("");
        System.out.println("-----------------------------");
        //ordenamos el vector A
        Arrays.sort(arregloA);
        //imprimimos el vector A ordenado
        for (int i = 0; i < arregloA.length; i++) {

            System.out.print("[" + arregloA[i] + "]");

        }
        System.out.println("");
        System.out.println("---------------");

        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];

        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;

        }
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("[" + arregloB[i] + "]");

        }

    }

}
