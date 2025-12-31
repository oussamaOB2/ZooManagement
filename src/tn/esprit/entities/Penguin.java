package tn.esprit.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth;

    public Penguin(){
        super();
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
