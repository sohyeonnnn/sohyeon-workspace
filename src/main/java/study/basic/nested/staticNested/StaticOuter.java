package study.basic.nested.staticNested;

public class StaticOuter {
    private static int outClassVlue = 3;
    private int outInstanceValue = 2;

    // 정적중첩클래스
    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){
            System.out.println("본인 클래스의 private 변수 접근가능 : "+ nestedInstanceValue);
            //System.out.println(outeInstanceValue);
            System.out.println("외부 클래스의 private 변수 접근가능 : "+ StaticOuter.outClassVlue);
        }
    }
}
