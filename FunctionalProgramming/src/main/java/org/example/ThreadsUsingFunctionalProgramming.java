package org.example;

import java.util.stream.IntStream;

public class ThreadsUsingFunctionalProgramming {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println(Thread.currentThread().getId()+" : "+i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        // using functional programming
        Runnable runnable1 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(Thread.currentThread().getId()+" : "+i);
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = () -> IntStream.range(0,1000)
                .forEach(i->System.out.println(Thread.currentThread().getId()+" : "+i));

        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
