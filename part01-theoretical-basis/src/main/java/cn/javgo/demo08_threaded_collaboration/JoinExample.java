package main.java.cn.javgo.demo08_threaded_collaboration;

/**
 * 线程协作
 */
public class JoinExample {
    private class A extends Thread{
        @Override
        public void run() {
            System.out.println("A");
        }
    }

    private class B extends Thread{
        private A a;

        B(A a){
            this.a = a;
        }

        @Override
        public void run(){
            try {
                // 等待线程 a 执行完毕
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("B");
        }
    }

    public void test(){
        A a = new A();
        B b = new B(a);

        // 先启动线程 b
        b.start();
        // 再启动线程 a
        a.start();
    }
}
