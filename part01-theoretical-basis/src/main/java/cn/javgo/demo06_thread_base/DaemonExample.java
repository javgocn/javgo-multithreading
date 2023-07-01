package main.java.cn.javgo.demo06_thread_base;

/**
 * 守护线程
 */
public class DaemonExample {
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

        // 设置为守护线程，必须在启动线程之前设置，否则会抛出异常
        myThread.setDaemon(true);

        // 启动线程
        myThread.start();
    }
}
