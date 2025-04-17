package io_stream;

import java.io.*;

public class Write {

    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("/Users/prabinsubedi/Desktop/OOP-in-Java/io_stream/myfile.txt");

            writer.write("This file has been writtern");
            writer.write("Another content");

            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
