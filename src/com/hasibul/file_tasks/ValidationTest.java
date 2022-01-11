package com.hasibul.file_tasks;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ValidationTest {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileDescriptor fileDescriptor = null;

        try {
            fileInputStream = new FileInputStream("/home/bs711/hasibul/official docs/Employee Information_Brain Station 23_Updated.xlsx");
            fileDescriptor = fileInputStream.getFD();

            System.out.println(fileDescriptor.valid());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
