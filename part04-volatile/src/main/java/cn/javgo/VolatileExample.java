package cn.javgo;

/**
 * 假设线程 A 执行 writer 方法，线程 B 执行 reader 方法
 */
public class VolatileExample {
    int a = 0;
    volatile boolean flag = false;

    public void writer() {
        a = 1;          // 1 线程 A 修改共享变量
        flag = true;    // 2 线程 A 写 volatile 变量
    }

    public void reader() {
        if (flag) {     // 3 线程 B 读同一个 volatile 变量
            int i = a;  // 4 线程 B 读共享变量
        }
    }
}
