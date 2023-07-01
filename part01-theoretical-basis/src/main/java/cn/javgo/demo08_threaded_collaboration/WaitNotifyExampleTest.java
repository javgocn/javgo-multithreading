package main.java.cn.javgo.demo08_threaded_collaboration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExampleTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();

        // 从线程池中获取两个线程对象执行任务
        executorService.execute(example::after); // 线程等待, 线程挂起,释放同步锁
        executorService.execute(example::before); // 线程唤醒
    }
}
