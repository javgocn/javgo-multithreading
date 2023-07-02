package cn.javgo;

/**
 * 可重入锁（递归锁）
 */
public class Widget {

    // 外层同步方法
    public synchronized void doSomething() {
        System.out.println("方法 1 执行 ...");
        // 调用 doOthers 方法（内层同步方法）
        doOthers();
    }

    public synchronized void doOthers() {
        System.out.println("方法 2 执行 ...");
    }
}
