package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }


}
