package org.example;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierInterfaceEx {
    public static void main(String[] args) {
        // supplier will not take any input, but returns output
        Supplier<Integer> randomInteger = ()->2;
        System.out.println(randomInteger.get());

        Supplier<Integer> random = () -> {
//            return 2;
            Random random1 = new Random();
            return random1.nextInt(1000);
        };
        System.out.println(random.get());
    }
}
