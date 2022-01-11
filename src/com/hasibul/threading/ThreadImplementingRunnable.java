package com.hasibul.threading;

import java.util.stream.Stream;

class ThreadClass implements Runnable {

    String name;

    @Override
    public void run() {
        System.out.println("Starting thread "+ name);

        Stream
                .iterate(1, integer -> integer+1)
                .limit(10)
                .forEach(integer -> {
                    try {
                        System.out.println(this.name + " - " +integer);
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });

        System.out.println("Ending thread "+ name);
    }

    ThreadClass(String name) {
        this.name = name;
    }
}

public class ThreadImplementingRunnable {
    public static void main(String[] args) {
        System.out.println("Main thread start.");
        Thread thread;

        Runnable runnableThreadClass = new ThreadClass("Thread #1");
        thread = new Thread(runnableThreadClass);
        thread.start();

        Runnable runnableThreadClass1 = new ThreadClass("Thread #2");
        thread = new Thread(runnableThreadClass);
        thread.start();

        System.out.println("Main thread end.");
    }
}
