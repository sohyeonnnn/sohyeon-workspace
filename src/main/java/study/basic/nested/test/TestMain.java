package study.basic.nested.test;

public class TestMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.NestedStaticClass staticClass = new OuterClass.NestedStaticClass();

        staticClass.printStatic("LocalClass.hello!!");
        outerClass.new InnerClass().innerPrint();

        new PrinterIf(){
            @Override
            public void print(){
                System.out.println("Anonymous.hello!");
            }
        }.print();

    }
}
