package com.github.parfenovvs;

public class MyThread extends Thread {

    public MyThread() {
        super("MyThread");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (isInterrupted()) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + " operation " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
                break;
            }
//            if (a < 5) {
//                Thread.yield();
//            }
        }

        System.out.println("Success stop");
    }
}
