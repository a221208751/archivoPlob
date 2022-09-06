import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca cadena");
        String cadena = sc.nextLine();
        int Bar1 = 7;
        caracterEn(cadena, Bar1);
    }
    public static void caracterEn(String cadena,int Bar1){
        try {
            if (Bar1 <= cadena.length() && Bar1 > 0) {
                System.out.println("Num. Caracter de cadena: " + cadena.charAt(Bar1));
            }else{
                System.out.println("Posicion de cadena no existente");
            }
        } catch (InputMismatchException ex) {

        }

    }
}

