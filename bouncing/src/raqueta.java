import java.awt.geom.Rectangle2D;
public class raqueta {
    private Rectangle2D.Double racket1;
    private Rectangle2D.Double racket2;
    public static final int WIDTH = 90;
    public static final int HEIGHT = 20;

    private final int[] yPositions = {10, 70, 130, 200, 270,330,390};
    private int pos = 4;

    public raqueta() {
        super();
        racket1 = new Rectangle2D.Double(10, 240, HEIGHT, WIDTH);
        racket2 = new Rectangle2D.Double(610, 240, HEIGHT, WIDTH);
    }

    public void arriba1() {
        if( pos > 0 ) {
            pos--;
            racket1.y = yPositions[pos];
        }
    }
    public void abajo1() {
        if( pos < 6) {
            pos++;
            racket1.y = yPositions[pos];
        }
    }
    public void arriba2() {
        if( pos > 0 ) {
            pos--;
            racket2.y = yPositions[pos];
        }
    }
    public void abajo2() {
        if( pos < 6 ) {
            pos++;
            racket2.y = yPositions[pos];
        }
    }
    public double bote1(){
        return racket1.x;
    }
    public double bote2(){
        return racket2.x;
    }
    public Rectangle2D.Double getRectangle1() {
        return racket1;
    }
    public Rectangle2D.Double getRectangle2() {
        return racket2;
    }
    public boolean check1( int x, int y) {
        return racket1.contains(x,y);
    }
    public boolean check2( int x, int y) {
        return racket2.contains(x,y);
    }
}
