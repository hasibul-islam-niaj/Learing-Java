package com.hasibul.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List arrayList = new ArrayList();

        arrayList.add("name");
        arrayList.add(10);
        arrayList.add(10283L);
        arrayList.add(10.30);
        arrayList.add(4747.299292F);
        arrayList.add(true);
        arrayList.add('c');

        arrayList.stream().forEach(o -> System.out.println(o.getClass() + ": " + o));
    }
}
