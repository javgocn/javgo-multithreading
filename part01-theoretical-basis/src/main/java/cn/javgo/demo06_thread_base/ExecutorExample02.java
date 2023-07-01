package main.java.cn.javgo.demo06_thread_base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample02 {
    public static void main(String[] args) {
        // 创建一个缓存线程池
        ExecutorService executorService = Executors.newCachedThreadPool();

        // 从线程池中获取一个线程对象执行任务，并通过 sumbit() 方法返回一个 Future 对象，
        // 最后调用 cancel(true) 方法取消任务，以中断该线程
        Future<?> future = executorService.submit(() -> {
            try{
                // 线程休眠 2s
                Thread.sleep(2000);
                System.out.println("Thread run");
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        });

        // 取消任务,参数为 true 时，会中断该线程
        future.cancel(true);

        // 关闭线程池（等待线程池中的任务执行完毕后中断所有线程）
        executorService.shutdown();
    }
}
