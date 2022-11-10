package yo.soytupadre;

//@author pittu
import java.util.Scanner;

public class YoSoyTuPadre {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = leer.nextInt();

        String[] A = new String[num];
        String[] B = new String[num];

        for (int i = 0; i < num; i++) {
            A[i] = leer.next();
            B[i]=leer.next();
            
        }
        for (int i = 0; i < num; i++) {
            if ((A[i].equals("Luke")) && (B[i].equals("padre")) ){
                System.out.println("TOP SECRET");
                
            }else{
            System.out.println(A[i]+", yo soy tu " +B[i]);
            
            }
            
            
            
            
           

        }
    }

}
