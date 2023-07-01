package main.java.cn.javgo.demo06_thread_base;

/**
 * 线程中断
 */
public class InterruptExample02  extends Thread {
    @Override
    public void run() {
        // 当 interrupted() 方法返回 true 时，退出循环
        while (!interrupted()) {
            // ..
        }
        System.out.println("Thread end");
    }
}
