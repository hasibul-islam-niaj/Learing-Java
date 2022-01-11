package com.hasibul.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ValidationFactory {

    public static boolean isEmpty(String data) {
        if (data == null || data.isEmpty())
            return true;

        return false;
    }

    public static String validate(ValidateEntity entity) {
        Field[] fields = entity.getClass().getFields();
        Arrays.stream(fields).forEach(field -> {
            Annotation[] annotations = field.getAnnotations();

            Arrays.stream(annotations).forEach(annotation -> {
                if (annotation.annotationType().toString().contains(NotEmpty.class.getTypeName())) {
                    try {
                        System.out.println(field.get(entity));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
        });

        return null;
    }
}



