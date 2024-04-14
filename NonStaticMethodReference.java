package org.example;

public class NonStaticMethodReference {
    void eat() {
        System.out.println("eating..");
    }
    void sleep() {
        System.out.println("sleeping ....");
    }

    public static void main(String[] args) {
        NonStaticMethodReference obj = new NonStaticMethodReference();
        // since eat is a non-static method calling via obj ref
        Activities activities = obj::eat;
        activities.activity();

        // we can call method using anonymous obj
        Activities activities2 = new NonStaticMethodReference() :: sleep;
        activities2.activity();
    }
}

interface Activities {
    void activity();
}
