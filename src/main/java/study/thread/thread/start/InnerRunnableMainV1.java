package study.thread.thread.start;

import static study.thread.util.MyLogger.log;

public class InnerRunnableMainV1 {

    public static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");

    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log(Thread.currentThread().getName() + " : run()");
        }
    }
}
