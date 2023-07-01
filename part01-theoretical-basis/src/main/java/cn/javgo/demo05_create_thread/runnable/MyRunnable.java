package main.java.cn.javgo.demo05_create_thread.runnable;

/**
 * 实现 Runnable 接口创建一个可以在线程中执行的任务
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("MyRunnable.run()");
    }
}
