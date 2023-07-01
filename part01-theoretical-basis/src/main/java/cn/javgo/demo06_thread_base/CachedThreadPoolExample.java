package main.java.cn.javgo.demo06_thread_base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 缓存线程池
 */
public class CachedThreadPoolExample {
    public static void main(String[] args) {
        // 创建一个缓存线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 提交任务
        for (int i = 0; i < 10; i++) {
            // 从线程池中获取线程执行任务
            int finalI = i;
            executorService.execute(
                    () -> System.out.println("第" + finalI + "个短时间任务")
            );
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
