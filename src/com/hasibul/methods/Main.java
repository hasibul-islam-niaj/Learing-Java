package com.hasibul.methods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Methods {
    @Deprecated
    public static void say() {
        System.out.println("Method Executed");
    }

    public void say(String name) {
        System.out.println("Hello " + name);
    }

    public void say(String name, String id) {
        System.out.println("Hello " + name + "[" + id + "]");
    }
}

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Methods.class.getMethod("say", String.class, String.class);
        method.invoke(new Methods(), "Hasibul", "BS1031");
    }
}
