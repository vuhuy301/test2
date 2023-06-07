package com.gof.creational.singleton;

import static java.util.Objects.isNull;

public final class MyServiceSingleton {

    private static MyServiceSingleton instance;

    private MyServiceSingleton() {}

    static {
        // Instantiate here if you want a Eager loading
    }

    // Laze way
    public static synchronized MyServiceSingleton getInstance() {
        if (isNull(instance)) {
            instance = new MyServiceSingleton();
        }
        return instance;
    }

    public int countTasks() {
        return 1;
    }
}
