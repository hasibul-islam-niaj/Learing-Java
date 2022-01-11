package com.hasibul.method_chaining;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.sql.Timestamp;
import java.util.Arrays;

@Retention(RetentionPolicy.SOURCE)
@Target({ElementType.TYPE})
@interface Comments {

    String author();
    String description();
    String[] applied();
}


@Comments(author = "Hasibul Islam",
        description = "For testing sequential and parallel stream.",
        applied = {"SCM", "ECommerce", "Materials Management"})
public class Chain {

    public static void main(String[] args) {
        Integer[] array = {
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10,
                1,2,3,4,5,6,7,8,9,10,   1,2,3,4,5,6,7,8,9,10};

        System.out.println(new Timestamp(System.currentTimeMillis()));
        Arrays.stream(array).sequential().forEach(System.out::print);
        System.out.println("\n"+new Timestamp(System.currentTimeMillis()));
    }
}
