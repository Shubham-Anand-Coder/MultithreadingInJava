package MultiThreading.OddEven;

public class PrintEven implements Runnable{
    @Override
    public void run() {
        for(int i = 2; i<=100; i+=2) {
            System.out.println(Thread.currentThread().getName() + " Printing no :" + i);
        }
    }
}
