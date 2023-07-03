package cn.javgo;

public class SynchronizedObjectLock06 implements Runnable {

    static SynchronizedObjectLock06 instance1 = new SynchronizedObjectLock06();
    static SynchronizedObjectLock06 instance2 = new SynchronizedObjectLock06();

    @Override
    public void run() {
        // synchronized 锁的是类，所有线程需要的是同一把锁，所以线程之间会有影响
        synchronized (SynchronizedObjectLock06.class) {
            System.out.println("我是线程" + Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();
    }
}
