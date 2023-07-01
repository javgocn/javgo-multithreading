package main.java.cn.javgo.demo08_threaded_collaboration;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 更灵活的线程等待与唤醒
 */
public class AwaitSignalExample {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before(){
        // 加锁
        lock.lock();
        try {
            System.out.println("before");
            // 线程挂起
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // 释放锁
            lock.unlock();
        }
    }

    public void after(){
        // 加锁
        lock.lock();
        try {
            System.out.println("after");
            // 唤醒所有等待的线程
            condition.signalAll();
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}
