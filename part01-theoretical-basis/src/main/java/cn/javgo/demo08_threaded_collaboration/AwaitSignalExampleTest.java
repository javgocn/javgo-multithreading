package main.java.cn.javgo.demo08_threaded_collaboration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AwaitSignalExampleTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        AwaitSignalExample example = new AwaitSignalExample();

        executorService.execute(example::after); // 线程等待,释放同步锁
        executorService.execute(example::before); // 线程唤醒
    }
}
