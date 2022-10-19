import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class threads2 implements Runnable {
    private String dir;
    public threads2(String s) {
        this.dir = s;
    }
    int cuenta = 0;
    int cuentaTotal = 0;
    double totalTime = 0;
    @Override
    public void run() {
        FileReader fin = null;
        BufferedReader in = null;
        long inicio1 = System.currentTimeMillis();
        try {
            fin = new FileReader(dir);
            in = new BufferedReader( fin );
        } catch (FileNotFoundException e) {
            in = new BufferedReader(fin);
        }
        String dir = null;
        try {
            while ( (dir = in.readLine()) != null ) {
                StringTokenizer st = new StringTokenizer(dir,"," );
                System.out.println(Thread.currentThread().getName()+": " + dir );
                cuenta = cuenta + 1;
                cuentaTotal = cuentaTotal + cuenta;
            }
            System.out.println("Número total de líneas de " + Thread.currentThread().getName() + " es igual a: " + cuenta);
        } catch (IOException e) {
            System.out.println( e.getMessage() );
            System.exit(1);
        }
        long fin1 = System.currentTimeMillis();
        double tiempo1 = (double) ((fin1 - inicio1));
        System.out.println(Thread.currentThread().getName() + " se tardó: " + tiempo1+"ms");
        totalTime = totalTime + tiempo1;

    }
}