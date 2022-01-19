package com.hasibul.arrays;

import java.util.Arrays;

public class VarArgumentsTest {
    public void sayAll(String... data){
        Arrays.stream(data).forEach(System.out::println);
    }

    public void sayAll(Integer... data){
        Arrays.stream(data).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VarArgumentsTest varArguments = new VarArgumentsTest();
        //varArguments.sayAll("323", "232", "23", "243", "3434");
        varArguments.sayAll(323, 232, 23, 243, 3434);
    }
}
