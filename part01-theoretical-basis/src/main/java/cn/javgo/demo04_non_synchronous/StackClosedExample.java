package main.java.cn.javgo.demo04_non_synchronous;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 栈封闭示例
 */
public class StackClosedExample {

    public void add100(){
        // 局部变量，线程封闭 (存储在虚拟机栈中，属于线程私有)
        int cnt = 0;

        // 循环操作局部变量
        for (int i = 0; i < 100; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        // 创建实例
        StackClosedExample example = new StackClosedExample();

        // 创建固定线程数量的线程池(默认线程数量为 CPU 核心数)
        ExecutorService executorService = Executors.newCachedThreadPool();
        // 从池中获取一个线程，执行 add100() 方法(该线程独占一份局部变量 cnt)
        executorService.execute(() -> example.add100()); // 100
        // 从池中获取一个线程，执行 add100() 方法（该线程独占一份局部变量 cnt）
        executorService.execute(() -> example.add100()); // 100

        // 关闭线程池
        executorService.shutdown();
    }
}
