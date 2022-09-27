import java.util.Scanner;
//jesus

public class PracticaConListasObregon {
    public static void main(String[] args) {

        archivo a = new archivo();
        String divinaComedia = a.leerTXT("C:\\Users\\jesus\\Downloads\\txt\\divina_comedia.txt");
        String [] palabras = divinaComedia.split(" ");
        System.out.println("Lista del total de palabras:");
        for(int i = 0; i < palabras.length; i++){
            System.out.println(i+".- " + palabras[i]);
        }
        System.out.println("Ingrese la palabra a buscar:");
        Scanner sc = new Scanner(System.in);
        String cadenaUsuario = sc.nextLine();
        int times = 0;
        for(int i = 0; i < palabras.length; i++){
            if(cadenaUsuario.equals(palabras[i])){
                    times = times + 1;
                }
            }
            System.out.println("Su palabra se repite " + times + " veces");
        }
    }
