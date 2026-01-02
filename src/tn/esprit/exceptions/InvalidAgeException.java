package tn.esprit.exceptions;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {

    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
