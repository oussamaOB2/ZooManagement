package tn.esprit.entities;

import tn.esprit.Food;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    // Peut redéfinir eatMeat si besoin
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println(getName() + " le pingouin mange des poissons");
        } else {
            System.out.println(getName() + " préfère le poisson !");
        }
    }

    public Penguin(){

    }

    public Penguin (String family, String name, int age, boolean mammal, String habitat, float swimmingDepth){
        super(family, name, age, mammal, habitat);
        this.setSwimmingDepth(swimmingDepth);
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public float setSwimmingDepth(float swimmingDepth) {
        return this.swimmingDepth = swimmingDepth;
    }

    @Override
    public void swim() {
        System.out.println("This penguin is swimming.");
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", mammal=" + mammal +
                ", habitat='" + habitat + '\'' +
                ", swimmingDepth=" + swimmingDepth + " m" +
                '}';
    }
}
