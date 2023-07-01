package main.java.cn.javgo.demo06_thread_base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void main(String[] args) {
        // 创建一个缓存线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取一个线程对象
        executorService.execute(() -> {
            try{
                // 线程休眠 2s
                Thread.sleep(2000);
                System.out.println("Thread run");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        // 关闭线程池（等待线程池中的任务执行完毕后中断所有线程）
        // executorService.shutdown();

        // 立即关闭线程池（不等待线程池中的任务执行完毕，立即中断所有线程）
        executorService.shutdownNow();

        System.out.println("Main run");
    }
}
