package main.java.cn.javgo.demo05_create_thread.thread;

public class Main {
    public static void main(String[] args) {
        // 创建一个 Thread 对象
        MyThread myThread = new MyThread();

        // 启动线程
        myThread.start();
    }
}
