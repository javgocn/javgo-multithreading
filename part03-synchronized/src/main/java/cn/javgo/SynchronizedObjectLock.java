package cn.javgo;

public class SynchronizedObjectLock implements Runnable{
    static SynchronizedObjectLock instance = new SynchronizedObjectLock();
    @Override
    public void run() {
        // 同步代码块形式——锁为 this（当前对象），如果多个线程使用同一个对象，那么这些线程就会被同步
        synchronized (this){
            System.out.println("我是对象锁的代码块形式，我叫 "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" 运行结束");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);

        thread.start();
        thread1.start();
    }
}
