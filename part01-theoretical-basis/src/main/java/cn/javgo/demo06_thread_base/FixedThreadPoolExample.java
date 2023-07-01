package main.java.cn.javgo.demo06_thread_base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 固定大小线程池
 */
public class FixedThreadPoolExample {
    public static void main(String[] args) {
        // 创建一个固定大小的线程池(10)
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 提交任务
        for (int i = 0; i < 10; i++) {
            // 从线程池中获取线程执行任务，如果池中没有空闲线程，则任务处于等待状态，直到有空闲线程为止
            int finalI = i;
            executorService.execute(
                    () -> {
                        System.out.println("第" + finalI + "个长时间任务");
                        try {
                            // 模拟长时间任务(5 秒)
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            );
        }

        // 关闭线程池
        executorService.shutdown();
    }
}
