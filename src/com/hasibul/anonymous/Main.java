package com.hasibul.anonymous;

public class Main {
    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass(){

            @Override
            public void sayHello(){
                System.out.println("Good Morning!!");
            }
        };

        AnonymousClass anonymousClass1 = new AnonymousClass();
        anonymousClass1.sayHello();
        anonymousClass1.sayName("Hasibul");

        anonymousClass.sayHello();
        anonymousClass.sayName("Niaj");
    }
}
