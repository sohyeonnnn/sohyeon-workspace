package study.basic.nested.inner;

public class InnerMain {
    public static void main(String[] args) {
        InnerOuter innerOuter = new InnerOuter();
        innerOuter.new Inner().print(); // 생성방법 외부.new 내부()
    }
}
