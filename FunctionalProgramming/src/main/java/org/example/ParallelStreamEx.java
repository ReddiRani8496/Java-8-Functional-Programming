package org.example;

import java.sql.Time;
import java.util.stream.LongStream;

public class ParallelStreamEx {
    public static void main(String[] args) {
        // parallel stream is faster than sequential stream


        long time = System.currentTimeMillis();
        System.out.println(LongStream.range(0,100000000).sum());
        System.out.println(System.currentTimeMillis()- time);
        long time1 = System.currentTimeMillis();
        System.out.println(LongStream.range(0,100000000).parallel().sum());
        System.out.println(System.currentTimeMillis()- time1);
    }
}
