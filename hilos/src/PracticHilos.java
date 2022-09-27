public class PracticHilos implements Runnable {
    private int nums;
    public PracticHilos(int n){this.nums = n;}
    @Override
    public void run() {
        int fact = 1;
        for(int i = nums; i > 0; i--){
            fact = fact * i;
        }
        System.out.println(Thread.currentThread().getName() + ":" + fact);
    }
}
