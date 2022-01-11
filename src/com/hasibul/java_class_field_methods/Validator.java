package com.hasibul.java_class_field_methods;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Validator {

    public String id;
    protected String name;
    protected String designation;

    Validator(){
        Field[] fields = Validator.class.getFields();
        Arrays.stream(fields).sequential().forEach(field -> {
            System.out.println(field.getName());
        });
    }
}
