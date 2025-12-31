package tn.esprit.entities;// tn.tn.esprit.entities.Zoo.java

public class Zoo {

    // ══════════════════════════════════════════════════════════════
    // CONSTANTE DE CLASSE (Instruction 14)
    // ══════════════════════════════════════════════════════════════
    static final int NUMBER_OF_CAGES = 25;

    // ══════════════════════════════════════════════════════════════
    // ATTRIBUTS PRIVÉS (Encapsulation)
    // ══════════════════════════════════════════════════════════════
    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PAR DÉFAUT
    // ══════════════════════════════════════════════════════════════
    public Zoo() {
        this.animals = new Animal[NUMBER_OF_CAGES];
        this.nbrAnimals = 0;
    }

    // ══════════════════════════════════════════════════════════════
    // CONSTRUCTEUR PARAMÉTRÉ
    // ══════════════════════════════════════════════════════════════
    public Zoo(String name, String city) {
        this.animals = new Animal[NUMBER_OF_CAGES];
        // Validation du nom dans le constructeur
        this.setName(name);
        this.city = city;
        this.nbrAnimals = 0;
    }

    // ══════════════════════════════════════════════════════════════
    // GETTERS
    // ══════════════════════════════════════════════════════════════

    public Animal[] getAnimals() {
        return animals;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    // ══════════════════════════════════════════════════════════════
    // SETTERS (avec validation)
    // ══════════════════════════════════════════════════════════════

    // VALIDATION : Le nom du zoo ne doit pas être vide
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("❌ Erreur : Le nom du zoo ne peut pas être vide !");
            this.name = "tn.tn.esprit.entities.Zoo Sans Nom";  // Valeur par défaut
        }
    }

    public void setCity(String city) {
        this.city = city;
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
        if (isfull()) {   //Instruction 17 : Modification de la méthode addAnimal
            System.out.println("❌ Le zoo est plein ! Impossible d'ajouter " + animal.getName());
            return false;
        }

        // Vérification 2 : L'animal existe-t-il déjà ? (NOUVEAU)
        if (searchAnimal(animal) != -1) {
            System.out.println("❌ " + animal.getName() + " est déjà dans le zoo.");
            return false;
        }

        // Ajouter l'animal à la prochaine position libre
        animals[nbrAnimals] = animal;
        nbrAnimals++;  // Incrémenter le compteur

        System.out.println("✅ " + animal.getName() + " a été ajouté au zoo.");
        return true;
    }

    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);

        if (index == -1){
            System.out.println("❌ " + animal.getName() + " n'est pas dans le zoo.");
            return false;
        }

        for (int i = index; i < nbrAnimals -1 ; i++){
            animals[i] = animals[i + 1];
        }
        animals[animals.length - 1] = null;

        nbrAnimals--;

        System.out.println("✅ " + animal.getName() + " a été supprimé du zoo.");
        return true;
    }

    public void displayAnimals(){
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println((i + 1) + ". " + animals[i]);
        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())){
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
        return "tn.tn.esprit.entities.Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}