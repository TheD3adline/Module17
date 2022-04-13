package com.company;

public class TooOldException extends Exception {

    public TooOldException(String message) { //We can add a custom message to our custom exception with this constructor
        super(message);
    }
}
