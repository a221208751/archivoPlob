import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class act3 {
    public static void main(String[] args) {
        String curp = null;
        //Llamamos al método:
        validacionCurp(curp);
    }
    public static void validacionCurp(String curp) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu curp: ");
        curp = sc.nextLine();
        Pattern pat = Pattern.compile("^\\w{4}+\\d{6}+[H|F]{1}+[AS|BC|BS|CC|CS|CH|DF|CL|CM|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QO|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS]{2}+\\w{3}+[A-Z0-9]{1}+\\d${1}");
        Matcher verificar = pat.matcher(curp);
        if (verificar.matches()) {
            System.out.println("CURP VALIDA");
        } else {
            System.out.println("CURP INVALIDA");
        }
    }
}
