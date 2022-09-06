public class act1 {

    public static void main(String[] args) {
        String cadena = "Desarrollo de sistemas 3";
        int Bar1 = 5;
        caracterEn(cadena, Bar1);
    }
    public static void caracterEn(String cadena, int Bar1) {
        try {
            if (Bar1 <= cadena.length() && Bar1 > 0) {
                System.out.println("Número de caracter de cadena: " + cadena.charAt(Bar1));
            }
        } catch (Exception e) {

        }
    }
}
