package com.epam.mjc.io;

import java.io.IOException;

public class StudentNotFoundException extends RuntimeException {

    public StudentNotFoundException(IOException message) {
        super(message);
    }

}
