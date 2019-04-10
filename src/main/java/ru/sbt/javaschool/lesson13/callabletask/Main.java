package ru.sbt.javaschool.lesson13.callabletask;


public class Main {
    public static void main(String[] args) {
        Task<String> task = new Task<>(
                () -> "My callable test " + "task"
        );

        Runnable runnable = () -> {
            try {
                task.get();
            } catch (ComputeException e) {
                System.err.println("ComputeException: " + e.getMessage());
            }
        };

        for (int i = 0; i < 10; i++) {
            new Thread(runnable).start();
        }
    }
}

