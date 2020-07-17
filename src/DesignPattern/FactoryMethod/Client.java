package DesignPattern.FactoryMethod;

public class Client {

    public static void main(String[] args) {
        Animal animal1 = AnimalFactory.getAnimal(AnimalType.DOG);
        System.out.println(animal1.getName());

        Animal animal2 = AnimalFactory.getAnimal(AnimalType.CAT);
        System.out.println(animal2.getName());
    }
}
