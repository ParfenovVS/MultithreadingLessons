package com.github.parfenovvs;

public class OneThreadDeadlock {
    private String x = "Deadlock";

    public void foo() {
        synchronized (x) {
            //...
//            synchronized (x) {
            System.out.println("Not Deadlock");
//            }
            //...
        }
    }

}
