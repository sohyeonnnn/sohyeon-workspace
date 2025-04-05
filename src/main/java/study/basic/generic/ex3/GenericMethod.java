package study.basic.generic.ex3;

public class GenericMethod  {

    public static Object objMethod(Object obj){
        System.out.println("Object print"+obj);
        return obj;
    }

    public static <T> void genericMethod(T obj){
        System.out.println("genericMethod print"+obj);
        //return obj;
    }

    public static <T> T genericMethod2(T obj){
        System.out.println("genericMethod2 print"+obj);
        return obj;
    }

    public static <T extends Number> T numberMethod(T obj){
        System.out.println("numberMethod print"+obj);
        return obj;
    }
}
