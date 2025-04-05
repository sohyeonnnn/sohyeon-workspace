package study.basic.generic.test.ex3;

import study.basic.generic.test.ex3.unit.BioUnit;

public class Shuttle <T extends BioUnit>{
    private T unit;

    public T getT() {
        return unit;
    }

    private void setT(T t) {
        unit = t;
    }

    public void in(T t) {
        setT(t);
    }

    public void showInfo() {
        System.out.println(unit);
    }

    @Override
    public String toString() {
        return "Shuttle{" +
                "unit=" + unit +
                '}';
    }
}
