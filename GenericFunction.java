package org.example;

public class GenericFunction {
    public static void main(String[] args) {
        TriFunction<Integer,Integer,Integer> tri = (x,y,z)-> {
            System.out.println(x+y+z);
        };
        tri.print(10,20,30);
    }
}

interface TriFunction<T,U,V> {
    void print(T t, U u, V v);
}
