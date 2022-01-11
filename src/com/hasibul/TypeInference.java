package com.hasibul;

import java.util.HashMap;
import java.util.Map;

public class TypeInference {

    public static void main(String[] args) {
        Map typeInference = new HashMap<Integer, String >();

        typeInference.put(102, "Hasibul");
        typeInference.put(103, "Shahinur");

        typeInference.forEach((key, value) -> System.out.println(value));
    }
}
