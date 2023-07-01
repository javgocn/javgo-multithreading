package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample04 {
    public static void main(String[] args) {
        // 创建一个线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(SynchronizedDemo04::func);
        executorService.execute(SynchronizedDemo04::func);
    }
}
