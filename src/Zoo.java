// Zoo.java

public class Zoo {

    // ══════════════════════════════════════════════════════════════
    // CONSTANTE DE CLASSE (Instruction 14)
    // ══════════════════════════════════════════════════════════════
    static final int NUMBER_OF_CAGES = 25;

    // ══════════════════════════════════════════════════════════════
    // ATTRIBUTS
    // ══════════════════════════════════════════════════════════════
    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;  // Compteur d'animaux actuels

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PAR DÉFAUT
    // ══════════════════════════════════════════════════════════════
    public Zoo() {
    }

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PARAMÉTRÉ
    // ══════════════════════════════════════════════════════════════
    public Zoo(String name, String city) {
        this.animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        this.nbrAnimals = 0;
    }

    public boolean isfull(){
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    public static Zoo compareZoo (Zoo z1, Zoo z2){
        if ( z1.nbrAnimals > z2.nbrAnimals){
            return z1;
        }
        return z2;
    }

    // ══════════════════════════════════════════════════════════════
    // MÉTHODE addAnimal() - Instruction 10
    // ══════════════════════════════════════════════════════════════
    public boolean addAnimal(Animal animal) {
        // Vérifier si le tableau est plein
        if (nbrAnimals >= animals.length) {
            System.out.println("❌ Le zoo est plein ! Impossible d'ajouter " + animal.name);
            return false;
        }

        // Vérification 2 : L'animal existe-t-il déjà ? (NOUVEAU)
        if (searchAnimal(animal) != -1) {
            System.out.println("❌ " + animal.name + " est déjà dans le zoo.");
            return false;
        }

        // Ajouter l'animal à la prochaine position libre
        animals[nbrAnimals] = animal;
        nbrAnimals++;  // Incrémenter le compteur

        System.out.println("✅ " + animal.name + " a été ajouté au zoo.");
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1){
            System.out.println("❌ " + animal.name + " n'est pas dans le zoo.");
            return false;
        }

        for (int i = index; i < animals.length -1 ; i++){
            animals[i] = animals[i + 1];
        }
        animals[animals.length - 1] = null;

        nbrAnimals--;

        System.out.println("✅ " + animal.name + " a été supprimé du zoo.");
        return true;
    }

    public void displayAnimals(){
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equals(animal.name)){
                return i;
            }
        }
        return -1;
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
        System.out.println("Animaux       : " + this.nbrAnimals + "/" + animals.length);
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
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}