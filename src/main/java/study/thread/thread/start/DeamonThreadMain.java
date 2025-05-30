package study.thread.thread.start;

public class DeamonThreadMain {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        DeamonThread deamonThread = new DeamonThread();
        deamonThread.setDaemon(true); //데몬스레드 여부, 기본=false=유저스레드
        deamonThread.start();
        System.out.println(Thread.currentThread().getName() + " : main() end");
        //여기까지 main에서 실행 후 java 종료
    }

    static class DeamonThread extends Thread{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName() +" : run()");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+" : run() end");
        }
    }
}
