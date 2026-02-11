package com.ravi.functionalinterfaces;

@FunctionalInterface
public interface FunctionalInterfacesExample {
    int sum(int a, int b);

    default void display(){
        System.out.println("default method!!");
    }

    static void staticDisplay(){
        System.out.println("static method!!");
    }
}