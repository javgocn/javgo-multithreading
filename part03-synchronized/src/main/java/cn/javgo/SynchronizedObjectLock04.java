package cn.javgo;

public class SynchronizedObjectLock04 implements Runnable{

    static SynchronizedObjectLock04 instance1 = new SynchronizedObjectLock04();
    static SynchronizedObjectLock04 instance2 = new SynchronizedObjectLock04();

    @Override
    public void run() {
        method();
    }

    // synchronized 用在普通方法上，默认的锁就是当前实例对象（this）
    public synchronized void method(){
        System.out.println("我是线程 " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 运行结束");
    }

    public static void main(String[] args) {
        // thread 和 thread1 是两个不同的对象，所以线程之间不会有影响
        Thread thread = new Thread(instance1);
        Thread thread1 = new Thread(instance2);

        thread.start();
        thread1.start();
    }
}
