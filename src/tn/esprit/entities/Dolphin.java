package tn.esprit.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed ;


    public Dolphin(){

    }

    public Dolphin (String family, String name, int age, boolean mammal, String habitat, float swimmingSpeed){
        super(family, name, age, mammal, habitat);
        this.setSwimmingSpeed(swimmingSpeed);
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // Redéfinition de swim() - Instruction 24
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }

    @Override
    public String toString() {
        return "Dolphin{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", mammal=" + mammal +
                ", habitat='" + habitat + '\'' +
                ", swimmingSpeed=" + swimmingSpeed + " km/h" +
                '}';
    }
}
