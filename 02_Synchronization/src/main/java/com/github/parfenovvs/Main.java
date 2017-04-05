package com.github.parfenovvs;

public class Main {
    static int x = 1;

    public static void main(String[] args) {
        //Data race/Race condition
//        startPrinter();
//        startIncrementor();
//        SyncSample syncSample = new SyncSample();
//        syncSample.startThreads();
        new OneThreadDeadlock().foo();
    }

    private static void startPrinter() {
        new Thread(() -> {
            while (true) {
                int localX = x;
                if (localX % 2 == 0) {
                    System.out.println(localX);
                }
            }
        }).start();
    }

    private static void startIncrementor() {
        new Thread(() -> {
            while (true) {
                x++;
            }
        }).start();
    }
}
