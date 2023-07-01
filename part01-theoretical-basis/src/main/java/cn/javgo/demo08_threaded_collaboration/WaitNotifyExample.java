package main.java.cn.javgo.demo08_threaded_collaboration;

/**
 * 线程挂起与唤醒
 */
public class WaitNotifyExample {

    public synchronized void before(){
        System.out.println("before");
        // 唤醒所有正在等待的线程
        notifyAll();
    }

    public synchronized void after(){
        try {
            // 等待当前线程被唤醒
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }
}
