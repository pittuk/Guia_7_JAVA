package lamaldiciondelaloteria;

//@author pittu
import java.util.Scanner;

public class LaMaldicionDeLaLoteria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese casos a estudiar");
        int cantidadCasos = leer.nextInt();
        int[] p = new int[cantidadCasos];
        int[] d = new int[cantidadCasos];
        int[] s = new int[cantidadCasos];
        int[] m = new int[cantidadCasos];

        for (int i = 0; i < cantidadCasos; i++) {
            int validar = 0;
            //ingresamos premio y validamos que este entre 1 y 10000000
            do {
                System.out.println("Ingrese premio");
                validar = leer.nextInt();
            } while (validar <= 0 || validar > 10000000);
            //asignamos premio
            p[i] = validar;
            //ingresamos minimo por dia y validamos que este entre 1 y 10000000
            do {
                System.out.println("Ingrese mínimo por día");
                validar = leer.nextInt();
            } while (validar <= 0 || validar > 10000000);
            //asignamos minimo por dia
            d[i] = validar;
            //ingresamos minimo por semana, validamos que este entre 1 y 10000000 
            //y que sea mayor o igual que minimo por dia
            do {
                System.out.println("Ingrese mínimo por semana");
                validar = leer.nextInt();
            } while (validar <= 0 || validar > 10000000 || validar < d[i]);
            //asignamos minimo por semana
            s[i] = validar;
            //ingresamos minimo por mes, validamos que este entre 1 y 10000000 
            //y que sea mayor o igual que minimo por semana
            do {
                System.out.println("Ingrese mínimo por mes");
                validar = leer.nextInt();
            } while (validar <= 0 || validar > 10000000 || validar < (s[i]));
            //asignamos minimo por mes
            m[i] = validar;

        }

        for (int i = 0; i < cantidadCasos; i++) {
            int dias = p[i] / d[i];
            int semanas = p[i] / s[i];
            int meses = p[i] / m[i];
            if (dias >= 1 && semanas < 1 && meses < 1) {
                System.out.println(meses + " " + semanas + " " + dias);
            }
            if (dias >= 1 && semanas >= 1 && meses < 1) {
                dias = s[i] / d[i];

                if (dias * d[i] >= p[i]) {
                    semanas = 0;
                    System.out.println(meses + " " + semanas + " " + dias);
                } else {
                    System.out.println(meses + " " + semanas + " " + dias);
                }
            }
            if (dias >= 1 && semanas >= 1 && meses >= 1) {
                semanas = m[i] / s[i];
                dias = s[i] / d[i];
                if (semanas * s[i] >= p[i]) {
                    meses = 0;
                    if (dias <= 7) {
                        semanas--;
                        System.out.println(meses + " " + semanas + " " + dias);
                    } else {
                        System.out.println(meses + " " + semanas + " " + dias);

                    }
                } else{
                    if (dias <= 7&&semanas<=4) {
                        semanas=0;
                        
                        System.out.println(meses + " " + semanas + " " + dias);
                        
                        
                    } else{
                    System.out.println(meses + " " + semanas + " " + dias);
                    
                    }
                
                }
            }
        }
    }
}
