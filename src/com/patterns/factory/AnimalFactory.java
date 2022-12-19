package com.patterns.factory;

/**
 * A factory class responsible for creating objects of type {@link Animal}.
 *
 * The factory determines which concrete implementation of {@link Animal} to create based on the input.
 */
public class AnimalFactory {
    /**
     * Returns an object of type {@link Animal} based on the provided animal type.
     *
     * @param animalType the type of animal to create
     * @return an object of type {@link Animal}, or {@code null} if the animal type is not recognized
     */
    public Animal getAnimal(String animalType) {
        if (animalType == null) {
            return null;
        }
        if (animalType.equalsIgnoreCase("DOG")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("CAT")) {
            return new Cat();
        }
        return null;
    }
}
