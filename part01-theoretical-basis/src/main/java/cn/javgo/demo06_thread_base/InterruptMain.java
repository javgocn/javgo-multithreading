package main.java.cn.javgo.demo06_thread_base;

public class InterruptMain {
    public static void main(String[] args) {
        // 创建一个 Thread 对象
        Thread myThread = new InterruptExample();

        // 启动线程
        myThread.start();

        // 中断线程,由于线程休眠会被中断异常打断，所以线程会抛出 InterruptedException 异常
        myThread.interrupt();

        // 不会执行从中断异常抛出时刻开始之后的代码,如果在抛出异常前已经执行了一部分代码，那么这部分代码会被执行
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
        }
    }
}
