package ru.sbt.javaschool.lesson13.callabletask;

import java.util.concurrent.Callable;

public class Task<T> {

    public Task(Callable<? extends T> callable) {
        //...
    }

    public T get() {
          // todo implement me
        return null;
    }

}
