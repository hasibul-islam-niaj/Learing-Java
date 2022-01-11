package com.hasibul.annotations;

import java.lang.reflect.Field;

public class Main {

    @Author(name = "Hasibul Islam",
            designation = "Associate Software Engineer",
            time = "12-Jan-2021 10:42 PM")
    public String empName;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Main main = new Main();
        System.out.println(main.empName);
    }

    Main() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException {
        Author annotation = Main.class.getField("empName").getAnnotation(Author.class);
        this.empName = annotation.name();

        Field empName = Main.class.getField("empName");
        empName.set(this, "Hello world");

    }
}
