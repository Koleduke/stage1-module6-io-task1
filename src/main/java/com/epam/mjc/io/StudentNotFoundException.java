package com.epam.mjc.io;

import java.io.IOException;

public class StudentNotFoundException extends Exception {

    public StudentNotFoundException(IOException message) {
        super(message);
    }

}