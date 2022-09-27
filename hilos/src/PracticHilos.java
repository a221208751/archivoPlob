public class PracticHilos implements Runnable {
    private int nums;
    public PracticHilos(int n){this.nums = n;}
    @Override
    public void run() {
        int fact = 1;
        if(nums == 0){
            System.out.println("Factorial de 0 es igual a: 1");
        } else {
            for(int i = nums; i > 0; i--){
                fact = fact * i;
            }
            System.out.println(Thread.currentThread().getName() + ":" + fact);
        }
    }
}
