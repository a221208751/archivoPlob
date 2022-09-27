import java.util.Scanner;
public class EliminacionPalabrasVacias {
    public static void main(String[] args) {
        archivo a = new archivo();
        String vacias = a.leerTXT("C:\\Users\\jesus\\Downloads\\txt\\stopwords-es.txt");
        String [] palabrasVacias = vacias.split("\\n");
        System.out.println("Lista del total de StopWords:");
        for(int i = 0; i < palabrasVacias.length; i++){
            System.out.println(i+".- " + palabrasVacias[i]);
        }
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String [] y = x.split(" ");
        int times = 0;
        for(int i = 0; i < palabrasVacias.length; i++){
            for(int o = 0; o < x.length(); o++){
                if(y[o]!=palabrasVacias[i]){
                    times = times + 1;
                }
            }
        }
        System.out.println("Hay " + times + " palabras que no son StopWords");
    }
}
