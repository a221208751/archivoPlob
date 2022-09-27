public class PracticHilosMain {
    public static void main(String[] args) {
        for(String s : args){
            int n = Integer.parseInt(s);
            Thread t = new Thread(new PracticHilos(n));
            t.start();
        }
    }
}
