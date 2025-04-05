package study.basic.generic.test.ex2;

import study.basic.generic.animal.Cat;

public class CatHospital {
    private Cat animal;

    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name : " +animal.getName());
        System.out.println("size : "+animal.getSize());
        animal.sound();
    }

    public Cat bigger (Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
