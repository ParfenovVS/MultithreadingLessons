package com.github.parfenovvs;

public class Sample {
    private Object o = new Object();

    public void nonstaticMethod() {
        synchronized (this) {

        }

        synchronized (o) {

        }

        //...
    }

    public static void staticSample() {
        synchronized (Sample.class) {

        }
    }


    public synchronized void syncNonstatic() {
        //some code
    }

    public void syncNonstatic2() {
        synchronized (this) {
            //some code
        }
    }

    public static synchronized void syncStatic() {
        //some code
    }

    public static void syncStatic2() {
        synchronized (Sample.class) {
            //some code
        }
    }

}
