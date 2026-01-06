package tn.esprit.Interface;

import tn.esprit.Food;

public interface Omnivore<T> extends Herbivore<T>,Carnivore<T> {

    void eatPlantAndMeat(Food food);

    void eatPlantAndMeet(T food);
}