package ru.sbt.javaschool.lesson13.executionmanager;

public interface ExecutionManager {
    Context execute(Runnable callback, Runnable... tasks);
}
