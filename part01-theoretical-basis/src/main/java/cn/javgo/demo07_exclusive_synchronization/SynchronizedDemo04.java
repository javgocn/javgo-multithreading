package main.java.cn.javgo.demo07_exclusive_synchronization;

/**
 * 同步一个静态方法
 */
public class SynchronizedDemo04 {

    /*
        使用 synchronized 关键字修饰一个静态方法，被修饰的静态方法称为同步静态方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象，
        不同对象调用该类的同步静态方法时，需要等待，也就是同步。
        这是一个非公平锁，即无法保证等待进入同步语句块的线程能公平地获得锁。
     */
    public synchronized static void func(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}
