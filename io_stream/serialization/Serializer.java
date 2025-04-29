package io_stream.serialization;

import java.io.*;

public class Serializer {

    public static void main(String[] args) {

        try {

            StudentInfo studentInfo = new StudentInfo(1, "Prabin Subedi", "98xxxxxx");
            
            FileOutputStream fos = new FileOutputStream("student.ser");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(studentInfo);


            // closing streams
            oos.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
