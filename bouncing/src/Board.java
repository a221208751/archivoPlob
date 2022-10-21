import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.util.Scanner;
public class Board extends JComponent implements Runnable, KeyListener {
    Dimension preferredSize = null;
    Ellipse2D.Double ball;
    private int PlayerCont1, PlayerCont2;
    private raqueta raquetas;
    public Board(int contPlayer1, int contPlayer2){
        this.PlayerCont1 = contPlayer1;
        this.PlayerCont2 = contPlayer2;
    }
   public Board() {
       setOpaque(true);
       setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.black));
       ball = new Ellipse2D.Double(20,320,15,15);
       raquetas = new raqueta();

       BallRunner bola = new BallRunner(ball, raquetas);
       Thread t1 = new Thread(bola);
       t1.start();
       Thread t2 = new Thread(this);
       t2.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isOpaque()) {
            g.setColor(getBackground());
            g.fillRect(0, 0, getWidth(), getHeight());
            g.setColor(getForeground());
        }

        Graphics2D  gg2 = (Graphics2D) g;
        String line = String.valueOf(ball.getX());
        gg2.drawString(Integer.toString(BallRunner.puntos1()),(250),(60));
        gg2.drawString(Integer.toString(BallRunner.puntos2()),(640-250),(60));
        gg2.setStroke(new BasicStroke(5.0f));
        gg2.setColor(Color.BLACK);
        gg2.drawLine(320,0,320,480);

        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5.0f));
        g2.setColor(Color.black);
        g2.fill(ball);
        g2.setColor(Color.blue);
        g2.fill(raquetas.getRectangle1());
        g2.setColor(Color.red);
        g2.fill(raquetas.getRectangle2());
    }

    public Dimension getPreferredSize() {
        if (preferredSize == null) {
            return new Dimension(640, 480);
        } else {
            return super.getPreferredSize();
        }
    }

    public void setPreferredSize(Dimension newPrefSize) {
        preferredSize = newPrefSize;
        super.setPreferredSize(newPrefSize);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
       char tecla = e.getKeyChar();
        switch (tecla) {
            case 'w':
            case 'W':
                raquetas.arriba1();
                break;
            case 's':
            case 'S':
                raquetas.abajo1();
                break;
            case 'o':
            case 'O':
                raquetas.arriba2();
                break;
            case 'l':
            case 'L':
                raquetas.abajo2();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while(true){
            repaint();
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
