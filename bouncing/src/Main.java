import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Pong");

        JPanel p = new JPanel(new BorderLayout());
        Board pong = new Board();
        p.add(pong, BorderLayout.CENTER);

        f.addKeyListener(pong);
        f.setContentPane(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}