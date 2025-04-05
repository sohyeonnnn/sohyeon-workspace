package study.basic.generic.test.ex2;

import study.basic.generic.animal.Animal;
import study.basic.generic.animal.Cat;
import study.basic.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();


        Animal biggerAnimal = catHospital.bigger(new Cat("cat2", 300));
        System.out.println("biggerAnimal : "+biggerAnimal);
    }
}
