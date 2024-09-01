package MultiThreading.OddEvenSyncronized;
import static MultiThreading.OddEvenSyncronized.Main.*;

public class PrintOdd implements Runnable{
    @Override
    public void run() {
        while (count <= LIMIT) {
           synchronized (lock) {
               if(count % 2 == 1) {
                   System.out.println(Thread.currentThread().getName() + " Printing : " + count);
                   count++;
                   lock.notify();
               }
               else {
                   try {
                       lock.wait();
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
           }
        }
    }
}
