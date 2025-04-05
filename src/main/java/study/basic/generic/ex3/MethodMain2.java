package study.basic.generic.ex3;

import study.basic.generic.animal.Cat;
import study.basic.generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("dog1", 100);
        Cat cat = new Cat("cat1", 200);

        AnimalMethod.checkUp(dog);
        AnimalMethod.checkUp(cat);

        Cat newCat= new Cat("cat2", 300);
        Dog newDog= new Dog("dog2", 300);

       AnimalMethod.bigger(cat, dog);
        System.out.println("........................");

       ComplexBox<Dog> complexBox = new ComplexBox();
       complexBox.set(newDog);
       complexBox.printAndReturn(newCat);
    }
}  
