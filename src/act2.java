import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class act2 {
    String curp;
    Scanner sc = new Scanner(System.in);
    public void validacionCurp(String curp) {
        System.out.print("Introduce tu curp: ");
        curp = sc.nextLine();
        Pattern curps = Pattern.compile("^\\w{4}+\\d{6}+[H|F]{1}+[AS|BC|BS|CC|CS|CH|DF|CL|CM|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QO|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS]{2}+\\w{3}+[A-Z0-9]{1}+\\d${1}");
        Matcher verificar = curps.matcher(curp);
        if (verificar.matches()) {
            System.out.println("CURP VALIDA");
        } else {
            System.out.println("CURP INVALIDA");
        }
    }
}