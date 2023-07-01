package main.java.cn.javgo.demo05_create_thread.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        // 创建 Callable 对象
        MyCallable myCallable = new MyCallable();

        // 创建 FutureTask 对象，传入 Callable 任务对象，用于接收任务执行结果
        FutureTask<String> futureTask = new FutureTask<>(myCallable);

        // 创建一个线程，传入 FutureTask 任务对象
        Thread thread = new Thread(futureTask);

        // 启动线程
        thread.start();

        try {
            // 获取任务执行结果
            String result = futureTask.get();
            // 输出任务执行结果
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
