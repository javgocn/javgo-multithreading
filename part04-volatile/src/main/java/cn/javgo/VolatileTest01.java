package cn.javgo;

/**
 * 演示 i++ 操作不是原子操作
 * 因为 i++ 操作并不是单次读/写操作，而是由三个操作组成：
 * 1.读取 i 的值
 * 2.对 i 的值加 1
 * 3.将 i 的值写入内存
 */
public class VolatileTest01 {
    volatile int i;

    public void add() {
        i++;
    }

    public static void main(String[] args) throws InterruptedException {
        final VolatileTest01 volatileTest01 = new VolatileTest01();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 休眠10毫秒，让线程有时间执行
                        Thread.sleep(10);
                        // 每个线程执行 1000 次 i++
                        volatileTest01.add();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
        // 主线程休眠10秒，让所有线程执行完毕
        Thread.sleep(10000);
        System.out.println(volatileTest01.i);
    }
}
