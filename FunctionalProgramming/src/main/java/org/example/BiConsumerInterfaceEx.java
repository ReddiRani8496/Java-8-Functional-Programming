package org.example;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceEx {
    public static void main(String[] args) {
        BiConsumer<String,String> consumer = (s1,s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        consumer.accept("reddi","rani");
    }
}
