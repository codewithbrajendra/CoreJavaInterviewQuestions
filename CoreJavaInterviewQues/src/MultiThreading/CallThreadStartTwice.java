package MultiThreading;

public class CallThreadStartTwice extends Thread{

    //No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. In such
    // case, thread will run once but for second time, it will throw exception.

    public void run() {
        System.out.println("Thread is Running.............");
    }

    public static void main(String[] args) {

        CallThreadStartTwice thread = new CallThreadStartTwice();
        thread.start();
        thread.start();
        //Note :- Run method execute once because First Thread is moved to runnable state when start method is invoke. Once main thread is
        //completed its task then first thread executes by Thread Scheduler
        // Output :- Exception in thread "main" java.lang.IllegalThreadStateException
       //Thread is Running.............

    }
}
