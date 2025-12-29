import java.util.Scanner;

// Classe principale - point d'entrée du programme
public class Main {

    public static void main(String[] args) {
        // ══════════════════════════════════════════════════════════
        // Création du Zoo avec constructeur paramétré
        // ══════════════════════════════════════════════════════════
        Zoo myZoo = new Zoo("Safari Park", "Paris");
        Zoo myZoo2 = new Zoo("Aquarium", "Lyon");

        // ══════════════════════════════════════════════════════════
        // Création des animaux avec constructeur paramétré
        // ══════════════════════════════════════════════════════════
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal eagle = new Animal("Accipitridae", "Aigle Royal", 3, false);
        Animal tiger = new Animal("Felidae", "Shere Khan", 7, true);
        Animal dolphin = new Animal("Delphinidae", "Flipper", 8, true);

        /** ══════════════════════════════════════════════════════════
        // Ajouter les animaux au zoo
        // ══════════════════════════════════════════════════════════
        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = eagle;
        myZoo.animals[3] = tiger;
        myZoo.animals[4] = dolphin;*/

        // ══════════════════════════════════════════════════════════
        // Test addAnimal()
        // ══════════════════════════════════════════════════════════
        System.out.println("=== Test addAnimal() ===\n");

        myZoo.addAnimal(lion);
        myZoo.addAnimal(elephant);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(tiger);
        myZoo2.addAnimal(dolphin);

        // ══════════════════════════════════════════════════════════
        // test displayAnimals()
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test displayAnimals() ===\n");
        myZoo.displayAnimals();

        Zoo plusGrand = Zoo.compareZoo(myZoo, myZoo2);
        System.out.println("\nLe zoo avec le plus d'animaux : " + plusGrand.name);

        /** ══════════════════════════════════════════════════════════
        // test searchAnimals()
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test searchAnimal(Aniamal animal) ===\n");
        System.out.println(myZoo.searchAnimal(lion2)); */

        // ══════════════════════════════════════════════════════════
        // Test removeAnimal()
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test removeAnimal() ===\n");

        System.out.println("AVANT suppression :");
        myZoo.displayAnimals();

        // Supprimer l'éléphant
        myZoo.removeAnimal(elephant);

        System.out.println("\nAPRÈS suppression :");
        myZoo.displayAnimals();


        // ══════════════════════════════════════════════════════════
        // Test de displayZoo()
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test displayZoo() ===");
        myZoo.displayZoo();

        // ══════════════════════════════════════════════════════════
        // Test de toString() pour Zoo
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test toString() Zoo ===");
        System.out.println(myZoo);

        // ══════════════════════════════════════════════════════════
        // Test de toString() pour Animal
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Test toString() Animal ===");
        System.out.println(lion);
        System.out.println(elephant);
        System.out.println(eagle);

        /** ══════════════════════════════════════════════════════════
        // Afficher tous les animaux du zoo
        // ══════════════════════════════════════════════════════════
        System.out.println("\n=== Tous les animaux du zoo ===");
        for (int i = 0; i < myZoo.animals.length; i++) {
            if (myZoo.animals[i] != null) {
                System.out.println(myZoo.animals[i]);
            }
        }

        // ══════════════════════════════════════════════════════════
        // Affichage
        // ══════════════════════════════════════════════════════════
        System.out.println("=== Mon Zoo ===");
        System.out.println("Nom : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Cages : " + myZoo.nbrCages);

        System.out.println("\n=== Animaux ===");
        System.out.println("1. " + lion.name + " (" + lion.family + ")");
        System.out.println("2. " + elephant.name + " (" + elephant.family + ")");
        System.out.println("3. " + eagle.name + " (" + eagle.family + ")");
        System.out.println("4. " + tiger.name + " (" + tiger.family + ")");
        System.out.println("5. " + dolphin.name + " (" + dolphin.family + ")");

        /**
        // ══════════════════════════════════════════════════════════
        // Création d'un objet Animal
        // ══════════════════════════════════════════════════════════
        Animal lion = new Animal();

        // Affectation des valeurs aux attributs
        lion.family = "Felidae";
        lion.name = "Simba";
        lion.age = 5;
        lion.isMammal = true;


        // ══════════════════════════════════════════════════════════
        // Création d'un objet Zoo
        // ══════════════════════════════════════════════════════════
        Zoo myZoo = new Zoo();

        // Affectation des valeurs aux attributs
        myZoo.name = "Safari Park";
        myZoo.city = "Paris";
        myZoo.nbrCages = 20;
        myZoo.animals = new Animal[25];  // Tableau de 25 animaux max

        // Ajouter le lion au zoo
        myZoo.animals[0] = lion;

        // ══════════════════════════════════════════════════════════
        // Affichage
        // ══════════════════════════════════════════════════════════
        System.out.println("=== Animal ===");
        System.out.println("Nom : " + lion.name);
        System.out.println("Famille : " + lion.family);
        System.out.println("Âge : " + lion.age + " ans");
        System.out.println("Mammifère : " + lion.isMammal);

        System.out.println("\n=== Zoo ===");
        System.out.println("Nom : " + myZoo.name);
        System.out.println("Ville : " + myZoo.city);
        System.out.println("Cages : " + myZoo.nbrCages);

        Scanner scanner = new Scanner(System.in);

        // Créer un objet ZooManagement
        Zoo zoo = new Zoo();

        // ══════════════════════════════════════════
        // Saisie du nom
        // ══════════════════════════════════════════
        System.out.print("Entrez le nom du zoo : ");
        zoo.name = scanner.nextLine();

        while (zoo.name.isEmpty()) {
            System.out.println("Erreur : Le nom ne peut pas être vide !");
            System.out.print("Entrez le nom du zoo : ");
            zoo.name = scanner.nextLine();
        }

        // ══════════════════════════════════════════
        // Saisie du nombre de cages
        // ══════════════════════════════════════════
        System.out.print("Entrez le nombre de cages : ");

        while (!scanner.hasNextInt()) {
            System.out.println("Erreur : Entrez un nombre valide !");
            scanner.next();
            System.out.print("Entrez le nombre de cages : ");
        }
        zoo.nbrCages = scanner.nextInt();

        while (zoo.nbrCages <= 0) {
            System.out.println("Erreur : Le nombre doit être positif !");
            System.out.print("Entrez le nombre de cages : ");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            zoo.nbrCages = scanner.nextInt();
        }

        scanner.close();

        // ══════════════════════════════════════════
        // Affichage
        // ══════════════════════════════════════════
        System.out.println("\n================================");
        System.out.println("Zoo créé avec succès !");
        System.out.println("Nom du zoo : " + zoo.name);
        System.out.println("Nombre de cages : " + zoo.nbrCages);
        System.out.println("================================");*/
    }
}