package main.java.cn.javgo.demo02_immutable;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Vector 线程不安全示例
 * 说明：
 * Vector 是线程安全的，但是在多线程环境下，多个线程同时访问同一个 Vector 实例的 add() 方法，会导致线程不安全问题。
 * 这是因为，Vector 的 add() 方法的同步锁是当前 Vector 实例，而不是方法内部的局部变量，所以多个线程同时访问同一个
 * Vector 实例的 add() 方法，会导致线程不安全问题。
 */
public class VectorUnsafeExample {

    // 实例化一个 Vector 对象（线程安全）
    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            // 主线程线程向 vector 中添加 100 个元素
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }

            // 实例化一个线程池
            ExecutorService executorService = Executors.newCachedThreadPool();

            // 从池中获取一个线程，向 vector 中删除元素
            executorService.execute(() -> {
                // 同步代码块，对 vector 进行加锁
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            });

            // 从池中获取一个线程，向 vector 中获取元素
            executorService.execute(() -> {
                // 同步代码块，对 vector 进行加锁
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println(vector.get(i));
                    }
                }
            });

            // 关闭线程池
            executorService.shutdown();
        }
    }
}
