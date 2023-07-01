package main.java.cn.javgo.demo07_exclusive_synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * JDK 实现的锁
 */
public class ReentrantLockDemo {

    // 创建一个锁对象
    private Lock lock = new ReentrantLock();

    /*
        ReentrantLock 是 java.util.concurrent.locks.Lock 的实现类,用于替代 synchronized 关键字
        ReentrantLock 是一个可重入的互斥锁,又被称为“独占锁”。它具有与使用 synchronized 方法和语句所访问的隐式监视器锁相同的基本行为和语义，
        但功能更强大、扩展性更好。它支持公平锁和非公平锁，默认情况下为非公平锁。
        下面在 func() 方法中调用了 lock() 方法获取锁，然后在 try 代码块之后，调用 unlock() 方法释放锁。
     */
    public void func(){
        // 加锁
        lock.lock();

        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        } finally {
            // 释放锁
            lock.unlock();
        }
    }
}
