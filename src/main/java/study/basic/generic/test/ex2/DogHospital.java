package study.basic.generic.test.ex2;

import study.basic.generic.animal.Dog;

public class DogHospital {
    private Dog animal;

    public void set(Dog animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name : " +animal.getName());
        System.out.println("size : "+animal.getSize());
        animal.sound();
    }

    public Dog bigger (Dog target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
