package main.java.cn.javgo.demo07_exclusive_synchronization;

/**
 * 同步一个方法
 */
public class SynchronizedDemo02 {

    /*
        使用 synchronized 关键字修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象，
        不同对象调用该方法时，需要等待，也就是同步。
        这是一个非公平锁，即无法保证等待进入同步语句块的线程能公平地获得锁。
     */
    public synchronized void func(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
