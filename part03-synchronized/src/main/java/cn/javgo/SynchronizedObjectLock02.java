package cn.javgo;

public class SynchronizedObjectLock02 implements Runnable{

    static SynchronizedObjectLock02 instance = new SynchronizedObjectLock02();

    // 创建两把锁
    Object block1 = new Object();
    Object block2 = new Object();

    @Override
    public void run() {
        // 使用第一把锁，后面的代码块由于锁不一样，所以不会被同步，因此可以并发执行
        synchronized (block1){
            System.out.println("我是lock1。我叫 "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" lock1 运行结束");
        }

        // 使用第二把锁
        synchronized (block2){
            System.out.println("我是lock2。我叫 "+Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" lock2 运行结束");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(instance);
        Thread thread1 = new Thread(instance);

        thread.start();
        thread1.start();
    }
}
