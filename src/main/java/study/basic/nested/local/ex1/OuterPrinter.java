package study.basic.nested.local.ex1;

public class OuterPrinter {
    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        class InnerPrinter implements Printer {
            int value = 0;

            @Override
            public void print(){
                System.out.println("본인의 변수 : " + value);
                System.out.println("외부 메서드의 인스턴스 변수 : " + localVar);
                System.out.println("외부 메서드의 매개 변수 : " + paramVar);
                System.out.println("외부 클래스의 인스턴스 변수 : " + outInstanceVar);
            }
        }

        // 지역클래스의 선언과 생성이 분리 되어있음 ! -> 익명클래스로 해결
        InnerPrinter printer = new InnerPrinter();
        printer.print();
    }
}
