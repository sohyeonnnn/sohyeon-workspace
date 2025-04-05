package study.basic.generic.ex3;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 20;
        Object object = GenericMethod.objMethod(i);

        Integer result = GenericMethod.<Integer>genericMethod2(i);
        System.out.println();

        GenericMethod.numberMethod(i);


    }
}
