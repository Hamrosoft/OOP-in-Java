package io_stream;

import java.io.*;

public class Read {

    public static void main(String[] args) {

        try {

            FileReader reader = new FileReader("/Users/prabinsubedi/Desktop/OOP-in-Java/io_stream/myfile.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();

            if (line != null) {

                System.out.println(line);
            } else {

                System.out.println("NO content to display");

            }

            bufferedReader.close();
            reader.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
