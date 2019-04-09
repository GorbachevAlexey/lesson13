package ru.sbt.javaschool.lesson13.executionmanager;

public interface Context {
    int getCompletedTaskCount();

    int getFailedTaskCount();

    int getInterruptedTaskCount();

    void interrupt();

    boolean isFinished();

}
