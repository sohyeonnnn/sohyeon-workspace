package study.basic.nested.test;

public class OuterClass {
    static class NestedStaticClass{ // 정적중첩클래스
        public void printStatic(String str){
            System.out.println("NestedStaticClass.hello!");

            class LocalClass implements PrinterIf{ // 로컬클래스
                //String str = "LocalClass.hello!";
                @Override
                public void print() {
                    System.out.println(str);
                }
            }

            LocalClass localClass = new LocalClass();
            localClass.print();
        }


    }

    class InnerClass{ // 내부클래스
        String str = "InnerClass.hello!";
        void innerPrint(){
            System.out.println(str);
        }
    }
}
