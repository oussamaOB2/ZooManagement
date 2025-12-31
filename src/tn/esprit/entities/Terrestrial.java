package tn.esprit.entities;

public class Terrestrial extends Animal {

    // Attribut spécifique
    protected int nbrLegs;

    // Constructeur par défaut
    public Terrestrial() {
        super();
    }

    // Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean mammal, int nbrLegs) {
        super(family, name, age, mammal);
        this.setNbrLegs(nbrLegs);
    }

    // Getter
    public int getNbrLegs() {
        return nbrLegs;
    }

    // Setter avec validation
    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs >= 0) {
            this.nbrLegs = nbrLegs;
        } else {
            System.out.println("❌ Erreur : Le nombre de pattes ne peut pas être négatif !");
            this.nbrLegs = 0;
        }
    }

    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", mammal=" + mammal +
                ", nbrLegs=" + nbrLegs +
                '}';
    }
}