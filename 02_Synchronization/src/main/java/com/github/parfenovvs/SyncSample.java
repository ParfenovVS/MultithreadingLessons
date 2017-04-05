package com.github.parfenovvs;

public class SyncSample {
    private int x = 1;
    private Object lock = new Object();

    public void startThreads() {
        startPrinter();
        startIncrementor();
    }

    private void startPrinter() {
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    if (x % 2 == 0) {
                        System.out.println(x);
                    }
                }
            }
        }).start();
    }

    private void startIncrementor() {
        new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    x++;
                }
            }
        }).start();
    }
}
