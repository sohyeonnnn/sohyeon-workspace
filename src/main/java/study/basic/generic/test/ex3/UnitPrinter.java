package study.basic.generic.test.ex3;

import study.basic.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> t) {
        T unit = t.getT();
        System.out.println(unit.toString());
    }
    public static  void printV2(Shuttle<? extends BioUnit> t){
        System.out.println(t);
    }
}
