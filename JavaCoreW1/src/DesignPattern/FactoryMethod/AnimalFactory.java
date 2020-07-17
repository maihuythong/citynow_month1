package DesignPattern.FactoryMethod;

public class AnimalFactory {

    public AnimalFactory() {
    }

    public static final Animal getAnimal(AnimalType type){
        switch (type){
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
            default:
                throw new IllegalArgumentException("Animal type is unsupported");
        }
    }
}
