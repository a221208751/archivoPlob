import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
public class hilosPastelito extends JPanel implements Runnable {
    int rango1 = 0;
    int rango2 = 0;
    int rango3 = 0;
    int rango4 = 0;
    private int total;
    private int ang1;
    private int ang2;
    private int ang3;
    private int ang4;
    public hilosPastelito(){
        Thread t = new Thread(this);
        t.start();
    }
    @Override
    public void run() {
        do {
            rango1 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            rango2 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            rango3 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            rango4 = (int) Math.floor(Math.random() * (1500 - 100 + 1) + 100);
            total = rango1 + rango2 + rango3 + rango4;
            ang1 = rango1 * 360 / total;
            ang2 = rango2 * 360 / total;
            ang3 = rango3 * 360 / total;
            ang4 = (360 - ang1 - ang2 - ang3);
            System.out.println("--ACTUALIZACIÓN--");
            System.out.println("Departamento 1: " + ang1);
            System.out.println("Departamento 2: " + ang2);
            System.out.println("Departamento 3: " + ang3);
            System.out.println("Departamento 4: " + ang4);
            System.out.println();
            this.repaint();
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while (true);
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        Arc2D.Float arco = new Arc2D.Float(Arc2D.PIE);
        arco.setFrame(50,10,400,400);

        //departamento1
        arco.setAngleStart(0);
        arco.setAngleExtent(ang1);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.MAGENTA);
        g2.fill(arco);

        //departamento2
        arco.setAngleStart(ang1);
        arco.setAngleExtent(ang2);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fill(arco);

        //departamento3
        arco.setAngleStart(ang1+ang2);
        arco.setAngleExtent(ang3);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.PINK);
        g2.fill(arco);

        //departamento4
        arco.setAngleStart(ang1+ang2+ang3);
        arco.setAngleExtent(ang4);
        g2.setColor(Color.BLACK);
        g2.draw(arco);
        g2.setColor(Color.YELLOW);
        g2.fill(arco);

    }


}