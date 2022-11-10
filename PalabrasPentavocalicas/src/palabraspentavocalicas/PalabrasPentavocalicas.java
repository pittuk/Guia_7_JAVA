package palabraspentavocalicas;

//@author pittu
import java.util.Scanner;

public class PalabrasPentavocalicas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = leer.nextInt();
        String vector[] = new String[num];
        for (int i = 0; i < num; i++) {
            vector[i] = leer.next();
            String frase = vector[i];
int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0, cont = 0,penta=0;

            for (int j = 0; j < frase.length(); j++) {
                if ((frase.charAt(j) == 'a')) {
                    contA++;
                    if (contA>1) {
                        contA=1;
                    }

                } else if ((frase.charAt(j) == 'e')) {
                    contE++;
                    if (contE>1) {
                        contE=1;
                    }

                } else if ((frase.charAt(j) == 'i')) {
                    contI++;
                    if (contI>1) {
                        contI=1;
                    }

                } else if ((frase.charAt(j) == 'o')) {
                    contO++;
                    if (contO>1) {
                        contO=1;
                    }

                } else if ((frase.charAt(j) == 'u')) {
                    contU++;
                    if (contU>1) {
                        contU=1;
                    }

                }
               
            }
            penta=contA+contE+contI+contO+contU;
            if (penta==5) {
                System.out.println("SI");
                
            }else{
                 System.out.println("NO");
            }

        }

    }

}
