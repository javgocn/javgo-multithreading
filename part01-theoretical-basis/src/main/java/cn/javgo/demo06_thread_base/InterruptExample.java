package main.java.cn.javgo.demo06_thread_base;

/**
 * 线程中断
 */
public class InterruptExample extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread.run()");

        try{
            // 线程休眠 1 毫秒
            Thread.sleep(1);
        }catch (InterruptedException e){ // 捕获中断异常
            // 再次设置中断标志位
            // Thread.currentThread().interrupt();
            // 打印异常堆栈信息
            e.printStackTrace();
        }
    }
}
