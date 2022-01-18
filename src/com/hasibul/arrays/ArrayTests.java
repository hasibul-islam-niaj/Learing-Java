package com.hasibul.arrays;

import java.util.Arrays;

public class ArrayTests {
    public static void main(String[] args) {
        int[] arr1, arr2;
        int arr3[], data;

        arr1 = new int[]{1, 2, 3, 4, 5, 6};
        arr2 = new int[]{1, 2, 3, 4, 5, 6};
        arr3 = new int[]{1, 2, 3, 4, 5, 6};
        data = 4;

        System.out.print("\nArray 1: ");
        Arrays.stream(arr1).forEach(System.out::print);

        System.out.print("\nArray 2: ");
        Arrays.stream(arr2).forEach(System.out::print);

        System.out.print("\nArray 3: ");
        Arrays.stream(arr3).forEach(System.out::print);

        System.out.println("\ndata: " + data);
    }
}
