package study.basic.generic.ex2;

import study.basic.generic.animal.Animal;
import study.basic.generic.animal.Cat;
import study.basic.generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", 0);
        Dog dog = new Dog("dog", 100);
        Cat cat = new Cat("cat", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println(findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println(findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println(findAnimal);

    }
}
