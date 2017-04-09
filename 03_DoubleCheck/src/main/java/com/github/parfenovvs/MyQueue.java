package com.github.parfenovvs;

import java.util.ArrayList;
import java.util.List;

public class MyQueue extends Thread {
    private List<Runnable> tasks = new ArrayList<>();

    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (tasks) {
                while (tasks.isEmpty()) {
                    try {
                        tasks.wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
            tasks.get(0).run();
            synchronized (tasks) {
                tasks.remove(0);
            }
        }
    }

    public void add(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notify();
        }
    }
}
