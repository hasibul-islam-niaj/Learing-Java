package com.hasibul.dp;

public class SingletonClass {
    private static SingletonClass singletonClass = new SingletonClass();

    public String empName;
    public String empId;

    private SingletonClass(){

    }

    public static SingletonClass getInstance(){
        return singletonClass;
    }

}
