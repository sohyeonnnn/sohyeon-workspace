package study.basic.nested.local;

public class LocalOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;

            public void printData(){
                System.out.println("본인의 변수 : " + value);
                System.out.println("외부 메서드의 인스턴스 변수 : " + localVar);
                System.out.println("외부 메서드의 매개 변수 : " + paramVar);
                System.out.println("외부 클래스의 인스턴스 변수 : " + outInstanceVar);
            }
        }

        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }
}
