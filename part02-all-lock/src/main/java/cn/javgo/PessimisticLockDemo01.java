package cn.javgo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 基于 synchronized 和 ReentrantLock 实现的悲观锁，每次操作共享数据时都需要先加锁，
 * 保证同一时刻只有一个线程能操作共享数据
 */
public class PessimisticLockDemo01 {

    // =========== 以下是基于 synchronized 实现的悲观锁 ===========
    public synchronized void testMethod() {
        // 临界区
    }

    // =========== 以下是基于 ReentrantLock 实现的悲观锁 ===========
    private Lock lock = new ReentrantLock();
    public void modifyPublicResources() {
        // 加锁
        lock.lock();
        try {
            // 临界区
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}
