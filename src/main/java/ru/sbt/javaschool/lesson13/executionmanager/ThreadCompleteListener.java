package ru.sbt.javaschool.lesson13.executionmanager;

public interface ThreadCompleteListener {
    void notifyOfThreadComplete(final Thread thread);
    void notifyOfThreadFailed(final Thread thread);
}
