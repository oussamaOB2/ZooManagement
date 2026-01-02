package tn.esprit.exceptions;

public class ZooFullException extends Exception {

    public ZooFullException() {
        super("Le zoo est plein ! Impossible d'ajouter un nouvel animal.");
    }

    public ZooFullException(String message) {
        super(message);
    }
}