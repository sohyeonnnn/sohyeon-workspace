package study.basic.generic.test.ex2;

import study.basic.generic.animal.Cat;
import study.basic.generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();


        Dog biggerDog = dogHospital.bigger(new Dog("dog2", 200));
        System.out.println(biggerDog);
    }
}
