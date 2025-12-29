package tn.esprit.entities;// tn.esprit.entities.Animal.java

public class Animal {

    // ══════════════════════════════════════════════════════════════
    // ATTRIBUTS PRIVÉS (Encapsulation)
    // ══════════════════════════════════════════════════════════════
    private String family;
    private String name;
    private int age;
    private boolean mammal;

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
        this.setAge(age);
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
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("❌ Erreur : L'âge ne peut pas être négatif !");
            this.age = 0;  // Valeur par défaut
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
        return "tn.esprit.entities.Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", Mammal=" + mammal +
                '}';
    }

}