package org.example;

public class MethodReference {
    class Dog {
        static void display() {
            System.out.println("Eating..");
        }
    }

    public static void main(String[] args) {
        Animal animal = Dog::display; // assigning the display method of Dog to animal interface method
        animal.eat();
    }
}

@FunctionalInterface
interface Animal {
    void eat();
}
