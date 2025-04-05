package study.basic.generic.test.ex2;

import study.basic.generic.animal.Animal;
import study.basic.generic.animal.Cat;
import study.basic.generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();


        Animal biggerAnimal = catHospital.bigger(dog);
        System.out.println("biggerAnimal : "+biggerAnimal);
    }
}
