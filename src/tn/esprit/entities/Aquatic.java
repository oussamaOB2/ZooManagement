package tn.esprit.entities;

public class Aquatic extends Animal {

    // Attribut spécifique (protégé pour les sous-classes)
    protected String habitat;

    // Constructeur par défaut
    public Aquatic() {
        super();  // Appelle Animal()
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean mammal, String habitat) {
        super(family, name, age, mammal);  // Appelle Animal(...)
        this.habitat = habitat;
    }

    // Getter
    public String getHabitat() {
        return habitat;
    }

    // Setter
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Méthode swim() - Instruction 24
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return "Aquatic{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", mammal=" + mammal +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}