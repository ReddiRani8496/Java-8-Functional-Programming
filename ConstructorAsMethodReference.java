package org.example;

public class ConstructorAsMethodReference {
    public static void main(String[] args) {
        Vehicle vehicle = Car::new;
        vehicle.stop(); // calls the stop method in vehicle class, this is a car printed
        vehicle.stop().stop(); // calls the stop method in car class
    }
}

class Car {
    Car() {
        System.out.println("This is a car");
    }
    void stop() {
        System.out.println("Stop the carrr...");
    }
}

interface Vehicle {
    Car stop();
}
