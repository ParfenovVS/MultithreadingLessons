package com.github.parfenovvs;

public class DeadlockExample {
    private String x = "DeadlockX";
    private String y = "DeadlockY";

    public void startThreads() {
        startA();
        startB();
    }

    private void startA() {
        new Thread(() -> {
            synchronized (x) {
                //---
                synchronized (y) {
                    //...
                }
                //...
            }
        }).start();
    }

    private void startB() {
        new Thread(() -> {
            synchronized (y) {
                //---
                synchronized (x) {
                    //...
                }
                //...
            }
        }).start();
    }
}
