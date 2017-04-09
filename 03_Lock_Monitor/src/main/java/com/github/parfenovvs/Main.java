package com.github.parfenovvs;

public class Main {
    static Object lock = new Object();

    public static void main(String[] args) {
//        //Примитив синхронизации - Lock - Mutex (Mutual Exclusion)
//
//        //Thread 1
//        synchronized (lock) {
//            //...
//        }
//
//        //...
//        //Thread 2
//        synchronized (lock) {
//            lock.equals("dfg");
//        }
//
//        Class<Main> cl = Main.class;
//
//        synchronized (Sample.class) {
//            //...
//        }

        thread1();
        thread2();
    }

    public static void thread1() {
        new Thread(() -> {
            synchronized (lock) {
                System.out.println("1");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2");
            }
        }).start();
    }

    public static void thread2() {
        new Thread(() -> {
            synchronized (lock) {
                System.out.println("3");
                System.out.println("4");
                //...
                lock.notify();
            }
            //...
        }).start();
    }
}

