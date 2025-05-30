package study.thread.thread.start;

public class HelloRunnableMain {

    public static void main(String[] args) {
        
        /*
        * 방법 1: Thread 상속 (+)run()만 재정의 (-)다른 클래스 상속 불가능
        * 방법 2: Runnable 구현 (+)다른 클래스 상속가능, 스레드와 실행할 작업 분리하여 코드가독성 높다 -> 이게 더 좋음
        * */
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start(); //run이 아닌 start, 별도의 스레드에서 run()실행

        System.out.println(Thread.currentThread().getName() + " : main() end");
    }
}
