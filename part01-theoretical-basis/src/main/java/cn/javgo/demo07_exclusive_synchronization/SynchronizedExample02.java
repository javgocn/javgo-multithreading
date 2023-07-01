package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample02 {
    public static void main(String[] args) {
        SynchronizedDemo02 synchronizedDemo02 = new SynchronizedDemo02();
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(synchronizedDemo02::func);
        executorService.execute(synchronizedDemo02::func);
    }
}
