package cn.javgo;

import java.util.concurrent.TimeUnit;

public class TestVolatile {

    // private static boolean stop = false;
    private volatile static boolean stop = false;

    public static void main(String[] args) {
        // Thread A
        new Thread("Thread A") {
            @Override
            public void run() {
                while (!stop) {
                }
                System.out.println(Thread.currentThread() + " stopped");
            }
        }.start();

        // Thread-main
        try {
            // 休眠1秒，让Thread A有时间执行
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread() + " after 1 seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }
}
