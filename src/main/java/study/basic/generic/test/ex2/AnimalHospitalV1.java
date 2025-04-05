package study.basic.generic.test.ex2;

import study.basic.generic.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name : " +animal.getName());
        System.out.println("size : "+animal.getSize());
        animal.sound();
    }

    public Animal bigger (Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }


}
