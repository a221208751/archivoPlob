import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticaConListasObregon {
    public static void main(String[] args) {
        archivo a = new archivo();
        String divinaComedia = a.leerTXT("C:\\Users\\jesus\\Downloads\\txt\\divina_comedia.txt");
        String [] palabras = divinaComedia.split(" ");
        System.out.println("Lista del total de palabras:");
        for(int i = 0; i < palabras.length; i++){
            System.out.println(i+".-" + palabras[i]);
        }
        System.out.println("Ingrese la palabra a buscar:");
        Scanner sc = new Scanner(System.in);
        String cadenaUsuario = sc.nextLine();
            int times = 0;
            for(int i = 0; i < palabras.length; i++){
                if(palabras[i] == cadenaUsuario){
                    times++;
                }
            }
            System.out.println("Su palabra se repite " + times + " veces");
        }
    }
