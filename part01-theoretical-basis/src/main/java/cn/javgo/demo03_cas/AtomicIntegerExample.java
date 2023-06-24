package main.java.cn.javgo.demo03_cas;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * AtomicInteger 整数原子类演示 CAS 操作
 * 说明：CAS（Compare And Swap）是一种无锁算法，它包含三个操作数——内存位置（V）、预期原值（A）和新值(B)。
 *      它只有在 V 的值等于 A 的值时，才会将 V 的值更新为 B，否则它什么都不会做。
 */
public class AtomicIntegerExample {

    // 实例化一个 AtomicInteger 对象
    private AtomicInteger cnt = new AtomicInteger();

    public void add(){
        // 调用 AtomicInteger 的 incrementAndGet() 方法，实现自增
        cnt.incrementAndGet();
    }

    public static void main(String[] args) {
        // 实例化一个 AtomicIntegerExample 对象
        AtomicIntegerExample atomicIntegerExample = new AtomicIntegerExample();
        // 调用 add() 方法，实现自增
        atomicIntegerExample.add();
        // 输出结果
        System.out.println(atomicIntegerExample.cnt); // 1
    }
}
