// Zoo.java

public class Zoo {

    // ══════════════════════════════════════════════════════════════
    // ATTRIBUTS
    // ══════════════════════════════════════════════════════════════
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PAR DÉFAUT
    // ══════════════════════════════════════════════════════════════
    public Zoo() {
        this.animals = new Animal[25];
    }

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PARAMÉTRÉ
    // ══════════════════════════════════════════════════════════════
    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.animals = new Animal[25];
    }

    // ══════════════════════════════════════════════════════════════
    // MÉTHODE displayZoo()
    // ══════════════════════════════════════════════════════════════
    public void displayZoo() {
        System.out.println("══════════════════════════════════");
        System.out.println("        INFORMATIONS DU ZOO        ");
        System.out.println("══════════════════════════════════");
        System.out.println("Nom du zoo    : " + this.name);
        System.out.println("Ville         : " + this.city);
        System.out.println("Nombre cages  : " + this.nbrCages);
        System.out.println("══════════════════════════════════");
    }

    // ══════════════════════════════════════════════════════════════
    // MÉTHODE toString() - Redéfinition
    // ══════════════════════════════════════════════════════════════
    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

}