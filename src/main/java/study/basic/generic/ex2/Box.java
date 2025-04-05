package study.basic.generic.ex2;

public class Box<T> {
    private T animal;

    public T get() {
        return animal;
    }

    public void set(T animal) {
        this.animal = animal;
    }
}
