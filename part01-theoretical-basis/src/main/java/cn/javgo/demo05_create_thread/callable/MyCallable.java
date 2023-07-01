package main.java.cn.javgo.demo05_create_thread.callable;

import java.util.concurrent.Callable;

/**
 * 实现 Callable 接口创建一个可以在线程中执行的任务
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "MyCallable.call()";
    }
}
