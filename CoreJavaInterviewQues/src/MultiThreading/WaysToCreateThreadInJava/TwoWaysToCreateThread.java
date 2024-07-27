package MultiThreading.WaysToCreateThreadInJava;

public class TwoWaysToCreateThread  extends  Thread{
    // By extending Thread class
    //  By implementing Runnable interface.
    // Thread class provide constructors and methods to create and perform operations on a thread.Thread class extends Object class and implements Runnable interface.

    //  Thread()
    //  Thread(String name)
    //  Thread(Runnable r)
    //  Thread(Runnable r,String name)

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String[] args) {

        TwoWaysToCreateThread obj = new TwoWaysToCreateThread();
        obj.start();

    }

}
