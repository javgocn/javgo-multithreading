package cn.javgo;

public class SynchronizedObjectLock03 implements Runnable{

    static SynchronizedObjectLock03 instance = new SynchronizedObjectLock03();

    @Override
    public void run() {
        method();
    }

    public synchronized void method(){
        System.out.println("我是对象锁的方法修饰符形式，我叫 "+Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" 运行结束");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);

        thread.start();
        thread1.start();
    }
}
