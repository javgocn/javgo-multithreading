package main.java.cn.javgo.demo05_create_thread.thread;

/**
 * 继承 Thread 类创建一个可以在线程中执行的任务
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread.run()");
    }
}
