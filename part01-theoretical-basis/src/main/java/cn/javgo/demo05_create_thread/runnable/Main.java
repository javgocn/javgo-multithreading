package main.java.cn.javgo.demo05_create_thread.runnable;

public class Main {
    public static void main(String[] args) {
        // 创建一个 Runnable 对象
        MyRunnable myRunnable = new MyRunnable();

        // 创建一个线程，传入 Runnable 任务对象
        Thread thread = new Thread(myRunnable);

        // 启动线程
        thread.start();
    }
}
