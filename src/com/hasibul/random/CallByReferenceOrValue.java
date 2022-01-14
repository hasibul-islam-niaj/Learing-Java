package com.hasibul.random;

class ReferenceType {
    public Integer a;
}

class Extender {
    public void testExtender(ReferenceType data) {
        data.a += 1;
    }

    public void integerExtender(int data) {
        data += 1;
    }

    public void integerExtender(Integer data) {
        data += 1;
    }
}

public class CallByReferenceOrValue {
    public static void main(String[] args) {
        Extender extender = new Extender();
        int integer = 10;
        Integer integer1 = 10;

        ReferenceType referenceType = new ReferenceType();
        referenceType.a = 100;

        extender.testExtender(referenceType);
        extender.integerExtender(integer);
        extender.integerExtender(integer1);

        System.out.println("Test Extender result? " + referenceType.a);
        System.out.println("Integer Extender result? " + integer);
        System.out.println("Integer Extender result-ref? " + integer1);
    }
}
