public class threads2Main {
    public static int totalCount;
    public static double tiempoTotal;
    public threads2Main(int cuentaTotal, double totalTime){
        this.totalCount = cuentaTotal;
        this.tiempoTotal = totalTime;
    }
    public static void main(String[] args) {
        for (String s : args) {
            Thread hilo = new Thread(new threads2(s));
            hilo.start();
        }
        System.out.println("Total de hilos se tardaron: " + tiempoTotal);
    }
}