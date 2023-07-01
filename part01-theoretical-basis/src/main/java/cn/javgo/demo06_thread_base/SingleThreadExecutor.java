package main.java.cn.javgo.demo06_thread_base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 单线程线程池
 */
public class SingleThreadExecutor {
    public static void main(String[] args) {
        // 创建一个单线程线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // 提交任务
        for (int i = 0; i < 10; i++) {
            // 从线程池中获取线程执行任务,每次只有一个线程执行任务，确保任务按提交顺序执行
            int finalI = i;
            executorService.execute(
                    () -> System.out.println("第" + finalI + "个任务")
            );
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
