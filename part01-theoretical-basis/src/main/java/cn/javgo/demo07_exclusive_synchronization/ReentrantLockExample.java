package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReentrantLockExample {
    public static void main(String[] args) {
        // 两个线程使用同一个对象的加锁方法，所以会互斥
        ReentrantLockDemo e = new ReentrantLockDemo();

        // 创建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(e::func);
        executorService.execute(e::func);
    }
}
