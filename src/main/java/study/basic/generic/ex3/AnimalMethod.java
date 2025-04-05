package study.basic.generic.ex3;

import study.basic.generic.animal.Animal;

public class AnimalMethod {

    public static <T extends Animal> void checkUp(T animal){
        System.out.println("name : " +animal.getName());
        System.out.println("size : "+animal.getSize());
        animal.sound();
    }

    public static <T extends Animal>T bigger (T animal, T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
