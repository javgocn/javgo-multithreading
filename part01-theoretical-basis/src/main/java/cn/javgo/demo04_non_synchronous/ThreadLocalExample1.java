package main.java.cn.javgo.demo04_non_synchronous;

/**
 * 线程本地存储 (Thread Local Storage) 示例
 */
public class ThreadLocalExample1 {
    public static void main(String[] args) {
        // 分别创建两个 ThreadLocal 对象
        ThreadLocal threadLocal1 = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();

        // 创建一个线程
        Thread thread1 = new Thread(() -> {
            // 向 threadLocal1 设置值
            threadLocal1.set(1);
            // 向 threadLocal2 设置值
            threadLocal2.set(1);
        });

        // 创建一个线程
        Thread thread2 = new Thread(() -> {
            // 向 threadLocal1 设置值
            threadLocal1.set(2);
            // 向 threadLocal2 设置值
            threadLocal2.set(2);
        });

        // 启动线程
        thread1.start();
        thread2.start();
    }
}
