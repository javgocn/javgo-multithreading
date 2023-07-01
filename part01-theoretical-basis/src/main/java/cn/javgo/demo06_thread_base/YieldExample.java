package main.java.cn.javgo.demo06_thread_base;

/**
 * 线程让步
 */
public class YieldExample {
    public static void main(String[] args) {
        // 创建一个 Thread 对象
        Thread myThread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("MyThread.run()");
                    }
                }
        );

        // 启动线程
        myThread.start();

        // 线程让步,让当前线程由运行状态转为就绪状态，让出 CPU 时间片
        Thread.yield();
    }
}
