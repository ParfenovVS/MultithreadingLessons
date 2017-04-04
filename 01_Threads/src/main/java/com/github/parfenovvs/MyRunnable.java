package com.github.parfenovvs;

import java.util.ArrayList;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
