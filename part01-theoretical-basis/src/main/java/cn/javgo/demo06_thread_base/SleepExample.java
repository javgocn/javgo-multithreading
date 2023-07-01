package main.java.cn.javgo.demo06_thread_base;

/**
 * 线程休眠
 */
public class SleepExample {
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

        // 线程休眠 1 秒
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
