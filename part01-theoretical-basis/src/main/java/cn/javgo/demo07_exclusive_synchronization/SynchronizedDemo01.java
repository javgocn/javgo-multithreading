package main.java.cn.javgo.demo07_exclusive_synchronization;

/**
 * 同步一个代码块
 */
public class SynchronizedDemo01 {
    public void func(){
        /*
            使用 synchronized 关键字修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号括起来的代码，
            作用的对象是调用这个代码块的对象，不同对象调用该代码块时，需要等待，也就是同步。
            这是一个非公平锁，即无法保证等待进入同步语句块的线程能公平地获得锁。
         */
        synchronized (this){
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }
}
