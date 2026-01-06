package tn.esprit.entities;

import tn.esprit.Interface.Carnivore;
import tn.esprit.Food;

public abstract class Aquatic extends Animal implements Carnivore <Food> {

    // Attribut spécifique (protégé pour les sous-classes)
    protected String habitat;

    // Constructeur par défaut
    public Aquatic() {
          // Appelle Animal()
    }

    // Constructeur paramétré
    public Aquatic(String family, String name, int age, boolean mammal, String habitat) {
        super(family, name, age, mammal);  // Appelle Animal(...)
        this.habitat = habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " mange de la viande (poissons, crustacés...)");
        } else {
            System.out.println(getName() + " ne mange que de la viande !");
        }
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
    public abstract void swim() ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aquatic other = (Aquatic) o;
        return name.equals(other.name) &&
                age == other.age &&
                habitat.equals(other.habitat);
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