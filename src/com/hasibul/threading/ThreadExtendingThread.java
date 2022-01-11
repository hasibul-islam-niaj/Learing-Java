package com.hasibul.threading;

import java.sql.Timestamp;
import java.util.stream.Stream;

class Printer {
    public static void print(Integer start, Integer limit) {
        Stream
                .iterate(start, integer -> integer+1)
                .limit(limit)
                .forEach(integer -> {
                    try {
                        System.out.print(integer+" ");
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
    }
}

class ThreadClass1 extends Thread{
    String name;
    Integer start, limit;

    @Override
    public void run() {
        System.out.println(new Timestamp(System.currentTimeMillis()) + " Starting thread "+ name);

         {
            Printer.print(start, limit);
        }

        System.out.println(new Timestamp(System.currentTimeMillis()) + "Ending thread "+ name);
    }

    ThreadClass1(String name, Integer start, Integer limit){
        this.name = name;
        this.start = start;
        this.limit = limit;
    }
}

public class ThreadExtendingThread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start.");
        Thread thread = new ThreadClass1("Thread #3", 1, 50);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Thread thread1 = new ThreadClass1("Thread #4", 51,  50);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println("Main thread end.");
    }
}
