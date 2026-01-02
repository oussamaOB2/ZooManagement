package tn.esprit.entities;// tn.tn.esprit.entities.Animal.java

import tn.esprit.exceptions.InvalidAgeException;

public class Animal {

    // Attributs protégés (visibles par les sous-classes)
    protected String family;
    protected String name;
    protected int age;
    protected boolean mammal;

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PAR DÉFAUT
    // ══════════════════════════════════════════════════════════════
    public Animal() {
    }

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PARAMÉTRÉ
    // ══════════════════════════════════════════════════════════════
    public Animal(String family, String name, int age, boolean mammal) {
        this.family = family;
        this.name = name;
        // Validation de l'âge dans le constructeur aussi
        this.age = age ;
        this.mammal = mammal;
    }

    // ══════════════════════════════════════════════════════════════
    // GETTERS
    // ══════════════════════════════════════════════════════════════

    public String getFamily() {
        return family;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Pour boolean : isMammal() au lieu de getMammal()
    public boolean isMammal() {
        return mammal;
    }

    // ══════════════════════════════════════════════════════════════
    // SETTERS (avec validation)
    // ══════════════════════════════════════════════════════════════

    public void setFamily(String family) {
        this.family = family;
    }

    public void setName(String name) {
        this.name = name;
    }

    // VALIDATION : L'âge ne peut pas être négatif
    public void setAge(int age) throws InvalidAgeException {
            if (age >= 0) {
                this.age = age;
            } else {
                throw new InvalidAgeException("the age must be positive");
            }
        }

    public void setMammal(boolean mammal) {
        this.mammal = mammal;
    }

    // ══════════════════════════════════════════════════════════════
    // MÉTHODE toString() - Redéfinition
    // ══════════════════════════════════════════════════════════════
    @Override
    public String toString() {
        return "tn.tn.esprit.entities.Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", Mammal=" + mammal +
                '}';
    }

}