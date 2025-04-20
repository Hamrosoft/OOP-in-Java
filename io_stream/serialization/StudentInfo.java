package io_stream.serialization;

import java.io.Serializable;

public class StudentInfo implements Serializable {

    int id;
    String name;

    String contact;

    StudentInfo(int id, String n, String c) {
        this.id = id;
        this.name = n;

        this.contact = c;

    }

}
