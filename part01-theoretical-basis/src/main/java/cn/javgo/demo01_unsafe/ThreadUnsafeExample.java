package main.java.cn.javgo.demo01_unsafe;

/**
 * 线程不安全示例
 */
public class ThreadUnsafeExample {

    // 共享变量
    private int cnt = 0;

    /**
     * 直接对共享变量进行修改
     */
    public void add() {
        cnt++;
    }

    /**
     * 访问共享变量
     */
    public int get() {
        return cnt;
    }
}
