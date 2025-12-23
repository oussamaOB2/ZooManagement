// Animal.java

public class Animal {

    // ══════════════════════════════════════════════════════════════
    // ATTRIBUTS
    // ══════════════════════════════════════════════════════════════
    String family;
    String name;
    int age;
    boolean isMammal;

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PAR DÉFAUT
    // ══════════════════════════════════════════════════════════════
    public Animal() {
    }

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PARAMÉTRÉ
    // ══════════════════════════════════════════════════════════════
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // ══════════════════════════════════════════════════════════════
    // MÉTHODE toString() - Redéfinition
    // ══════════════════════════════════════════════════════════════
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

}