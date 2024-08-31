package MultiThreading.OddEven;

public class PrintOdd implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=100; i+=2) {
            System.out.println(Thread.currentThread().getName() + " Printing no :" + i);
        }
    }
}
