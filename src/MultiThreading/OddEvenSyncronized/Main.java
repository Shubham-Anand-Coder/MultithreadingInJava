package MultiThreading.OddEvenSyncronized;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static int count = 1;
    public static int LIMIT = 100;
    public static final ReentrantLock lock = new ReentrantLock();


    public static void main(String[] args) {

        Thread even = new Thread(new PrintEven());
        Thread odd = new Thread(new PrintOdd());

        even.start();
        odd.start();

    }








}
