package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample01 {
    public static void main(String[] args) {
        SynchronizedDemo01 synchronizedDemo01 = new SynchronizedDemo01();
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(synchronizedDemo01::func);
        executorService.execute(synchronizedDemo01::func);
    }
}
