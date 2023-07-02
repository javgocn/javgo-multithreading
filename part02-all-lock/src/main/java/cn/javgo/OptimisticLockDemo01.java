package cn.javgo;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 乐观锁
 * JUC 包下的原子类 AtomicInteger、AtomicLong、AtomicReference 等都是基于 CAS 实现的
 * CAS 算法：Compare And Swap，比较并交换，是一种无锁算法，会直接先对数据进行操作，当需要
 *         更新数据时，会先比较当前数据是否和期望的数据一致，如果一致则更新，否则不断重试或者
 *         抛出异常。
 */
public class OptimisticLockDemo01 {
    // 需要保证多个线程操作的是同一个原子类对象
    private AtomicInteger atomicInteger = new AtomicInteger();

    // 执行自增操作
    public void increment() {
        // 先获取当前值，再加 1，最后更新
        atomicInteger.getAndIncrement();
    }
}
