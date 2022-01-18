package com.hasibul.strings;

public class StringTest {

    public static void main(String[] args) {
        StringBuilder data = new StringBuilder();
        StringBuilder data1 = new StringBuilder();

        for (char i = 'a'; i <= 'z'; i++){
            data.append(i);
        }

        data.reverse();

        System.out.println(data);
    }
}
