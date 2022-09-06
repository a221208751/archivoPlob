import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su valor númerico:");
        int int2 = sc.nextInt();
        try {
            if(int2 > 0) {
                NumeroNegativoExcepcion.raiz (int2);
            } else {
                NumeroNegativoExcepcion.mostrar();
            }
        } catch (InputMismatchException ex){
        }
    }
}




