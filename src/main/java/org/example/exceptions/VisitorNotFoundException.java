package org.example.exceptions;

public class VisitorNotFoundException extends Exception {

    public VisitorNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public VisitorNotFoundException(String message) {
        super(message);
    }


}
