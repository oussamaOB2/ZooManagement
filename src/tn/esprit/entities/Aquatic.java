package tn.esprit.entities;

public abstract class Aquatic extends Animal {

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