package main.java.cn.javgo.demo04_non_synchronous;

/**
 * 线程本地存储 (Thread Local Storage) 示例
 */
public class ThreadLocalExample {
    public static void main(String[] args) {
        // 创建一个 ThreadLocal 对象
        ThreadLocal threadLocal = new ThreadLocal();

        // 创建一个线程
        Thread thread1 = new Thread(() -> {
            // 设置线程本地变量的值，该值属于当前线程，其他线程无法访问
            threadLocal.set(1);
            try {
                // 休眠 1 秒(确保 thread2 线程执行)
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 输出线程本地变量的值
            System.out.println(threadLocal.get());
            // 清除线程本地变量的值
            threadLocal.remove();
        });

        // 创建一个线程
        Thread thread2 = new Thread(() -> {
            // 设置线程本地变量的值，该值属于当前线程，其他线程无法访问
            threadLocal.set(2);
            // 清除线程本地变量的值
            threadLocal.remove();
        });

        // 启动线程
        thread1.start();
        thread2.start();
    }
}
