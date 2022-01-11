package com.hasibul.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 1, 5, 6, 7, 8, 9);

        List<Integer> integers1 = integers.stream()
                .filter(integer -> integer == 1)
                .collect(Collectors.toList());

        integers1.forEach(System.out::println);
    }
}
