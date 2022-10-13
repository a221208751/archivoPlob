import javax.swing.*;
import java.awt.*;

public class hilosPastelMain {
    public static void main(String[] args) throws InterruptedException {
        int infinito = 1;
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame ventana = new JFrame("Grafica");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setBackground(Color.white);
        ventana.setSize(800,800);

        hilosPastelito panel = new hilosPastelito();
        ventana.add(panel);
        ventana.setVisible(true);
    }
}