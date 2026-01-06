package tn.esprit.entities;

import tn.esprit.Food;
import tn.esprit.Interface.Omnivore;

public class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String family, String name, int age, boolean mammal, int nbrLegs) {
        super(family, name, age, mammal);
        this.setNbrLegs(nbrLegs);
    }

    // ══════════════════════════════════════════════════════════
    // Implémentation des méthodes de l'interface Omnivore
    // ══════════════════════════════════════════════════════════

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getName() + " mange de la viande");
        } else {
            System.out.println(getName() + " peut manger de la viande, mais préfère autre chose");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getName() + " mange des plantes");
        } else {
            System.out.println(getName() + " peut manger des plantes, mais préfère autre chose");
        }
    }

    // ⚠️ CORRECTION ICI : eatPlantAndMeat (pas eatPlantAndMeet)
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getName() + " mange de tout : viande ET plantes !");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else {
            eatPlant(food);
        }
    }

    // ══════════════════════════════════════════════════════════
    // Getters et Setters
    // ══════════════════════════════════════════════════════════

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs >= 0) {
            this.nbrLegs = nbrLegs;
        } else {
            System.out.println("Erreur : Le nombre de pattes ne peut pas être négatif !");
            this.nbrLegs = 0;
        }
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

    @Override
    public void eatPlantAndMeet(Food food) {

    }
}