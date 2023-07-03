package cn.javgo;

public class SynchronizedDemo02 {
    Object object = new Object();

    public void method1(){
        synchronized (object){

        }
        method2();
    }

    private static void method2(){

    }
}
