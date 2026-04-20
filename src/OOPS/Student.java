package OOPS;

import java.util.*;

class Student {
    // static — shared across ALL Student objects
    static int counter = 0;

    // instance — belongs to THIS specific student
    int enrollmentNumber;
     String name;

    // Constructor — auto assigns next number
    public Student(String name) {
        counter++;                        // increment shared counter
        this.enrollmentNumber = counter;  // assign current value
        this.name = name;
    }

    // toString — defines what prints
    @Override
    public String toString() {
        return enrollmentNumber + ": " + name;
    }
}

