package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample03 {
    public static void main(String[] args) {
        // 创建两个不同的对象
        SynchronizedDemo03 e1 = new SynchronizedDemo03();
        SynchronizedDemo03 e2 = new SynchronizedDemo03();

        // 创建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(e1::func);
        executorService.execute(e2::func);
    }
}
