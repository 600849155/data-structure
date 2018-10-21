package Thread;

import static java.lang.Thread.sleep;
import static java.lang.Thread.yield;

public class Yield {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.print("1");
                yield();
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("3");

            }
        });

       Thread t2 = new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("2");
           }
       });
        t1.start();

        t2.start();
        t2.wait();

    }



}  