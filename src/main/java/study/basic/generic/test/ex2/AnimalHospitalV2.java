package study.basic.generic.test.ex2;


import study.basic.generic.animal.Animal;

public class AnimalHospitalV2<T extends Animal> {

    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("name : " +animal.getName());
        System.out.println("size : "+animal.getSize());
        animal.sound();
    }

    public T bigger (T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }


}
