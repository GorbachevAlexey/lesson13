package ru.sbt.javaschool.lesson13.callabletask;

import java.util.concurrent.Callable;

public class Task<T> {
    private final Callable<? extends T> callable;
    private volatile T result;
    private volatile ComputeException exception;

    public Task(final Callable<? extends T> callable) {
        this.callable = callable;
    }

    public T get() {
        if (exception != null)              //Если возникла ошибка при вычислении - возвращаем свой RuntimeException
            throw exception;

        if (result != null) {                //Если результат уже вычислен - возвращаем его
            System.err.println("return cashed value");
            return result;
        }

        synchronized (this) {               //Иначе пытаемся выполнить Callable
            try {
                System.err.println("calculate result");
                result = callable.call();
                //int i = 1/0;              //Для тестирования обработки исключения
            } catch (Exception e) {
                exception = new ComputeException(e);
                throw exception;
            }
        }

        return result;
    }

}
