package study.basic.nested.staticNested;

public class staticMain {
    public static void main(String[] args) {
        //NestedOuter nestedOuter = new NestedOuter();
        StaticOuter.Nested nested = new StaticOuter.Nested();
        nested.print();
    }
}
