package io_stream.serialization;

import java.io.*;

public class Deserializer {

    public static void main(String[] args) {
        StudentInfo studentInfo = null;

        try {

            FileInputStream fis = new FileInputStream("/Users/prabinsubedi/Desktop/OOP-in-Java/student.ser");

            ObjectInputStream ois = new ObjectInputStream(fis);

            studentInfo = (StudentInfo) ois.readObject();

            // closing streams
            ois.close();
            fis.close();

            System.out.println(
                    "Id: " + studentInfo.id + " Name: " + studentInfo.name + " Contact : " + studentInfo.contact);

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
