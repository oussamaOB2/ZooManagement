import java.util.Scanner;

// Classe principale - point d'entrée du programme
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Créer un objet ZooManagement
        ZooManagement zoo = new ZooManagement();

        // ══════════════════════════════════════════
        // Saisie du nom
        // ══════════════════════════════════════════
        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        while (zoo.zooName.isEmpty()) {
            System.out.println("Erreur : Le nom ne peut pas être vide !");
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine();
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
        System.out.println("Nom du zoo : " + zoo.zooName);
        System.out.println("Nombre de cages : " + zoo.nbrCages);
        System.out.println("================================");
    }
}