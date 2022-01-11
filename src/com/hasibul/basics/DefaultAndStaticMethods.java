package com.hasibul.basics;

interface DefaultMethodTesting {
    default void print(String text){
        System.out.println(text);
    }
}

interface StaticMethodTesting {
    static void print(String text) {
        System.out.println(text);
    }
}

public class DefaultAndStaticMethods {
    public static void main(String[] args) {
        DefaultMethodTesting defaultMethodTesting = new DefaultMethodTesting() {};
        defaultMethodTesting.print("Hello..");

        StaticMethodTesting.print("Hello world");
    }
}
