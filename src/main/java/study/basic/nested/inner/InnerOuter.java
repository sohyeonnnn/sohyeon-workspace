package study.basic.nested.inner;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue =2;

    class Inner {
        private int innerInstanceValue = 1;

        public void print(){
            System.out.println("본인의 private 변수 접근가능 : " + innerInstanceValue);
            System.out.println("외부의 private instance 변수 접근가능 : " + outInstanceValue);
            System.out.println("외부의 private static 변수 접근가능 : " + outClassValue);
        }
    }
}
