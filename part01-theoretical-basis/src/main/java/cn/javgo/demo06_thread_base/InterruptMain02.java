package main.java.cn.javgo.demo06_thread_base;

public class InterruptMain02 {
    public static void main(String[] args) {
        // 创建一个 Thread 对象
        Thread myThread = new InterruptExample02();

        // 启动线程
        myThread.start();

        // 中断线程,当 interrupted() 方法返回 true 时，退出循环
        myThread.interrupt();
    }
}
