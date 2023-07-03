package cn.javgo;

public class SynchronizedObjectLock05 implements Runnable{

    static SynchronizedObjectLock05 instance1 = new SynchronizedObjectLock05();
    static SynchronizedObjectLock05 instance2 = new SynchronizedObjectLock05();

    @Override
    public void run() {
        method();
    }

    // synchronized 用在静态方法上，默认的锁是当前类的class对象,所以无论是哪个实例，线程之间都会有影响
    public static synchronized void method(){
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instance1);
        Thread t2 = new Thread(instance2);

        t1.start();
        t2.start();
    }
}
