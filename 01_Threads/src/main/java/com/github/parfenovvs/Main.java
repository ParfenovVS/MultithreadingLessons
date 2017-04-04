package com.github.parfenovvs;

public class Main {
    public static void main(String[] args) {
//        simpleMethod();
//        MyThread myThread = new MyThread();
////        myThread.setDaemon(true);
//        myThread.start();
//
//        System.out.println("Hello");
//
////        myThread.interrupt();
//
//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Поток MyThread ТОЧНО ЗАВЕРШИЛСЯ");

        Thread myRunnable = new Thread(new MyRunnable());

        myRunnable.start();

        myRunnable.interrupt();

    }

    private static void simpleMethod() {
        System.out.println(Thread.currentThread().getName());
    }
}
