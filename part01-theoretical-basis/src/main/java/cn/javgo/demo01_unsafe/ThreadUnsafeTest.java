package main.java.cn.javgo.demo01_unsafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1000个线程同时访问线程不安全的示例
 */
public class ThreadUnsafeTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建实例
        ThreadUnsafeExample example = new ThreadUnsafeExample();

        // 定义线程数量
        int threadSize = 1000;

        // 用来让主线程等待 threadSize 个子线程执行完毕
        final CountDownLatch countDownLatch = new CountDownLatch(threadSize);

        // 创建固定线程数量的线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 循环执行 threadSize 个子线程
        for (int i = 0; i < threadSize; i++) {
            // 执行子线程
            executorService.execute(() -> {
                // 修改共享变量
                example.add();
                // 释放线程
                countDownLatch.countDown();
            });
        }

        // 主线程等待所有子线程执行完成，再向下执行
        countDownLatch.await();

        // 关闭线程池
        executorService.shutdown();

        // 输出结果
        System.out.println(example.get());
    }
}
