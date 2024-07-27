package MultiThreading;

public class ThreadSleep extends Thread{

    public void run(){
        for(int i=1;i<5;i++){
            // the thread will sleep for the 500 milli seconds
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    //Whenever the Thread.sleep() methods execute, it always halts the execution of the current thread.
    //Whenever another thread does interruption while the current thread is already in the sleep mode, then the InterruptedException is thrown.

    public static void main(String[] args) {
       ThreadSleep ts1 = new ThreadSleep();
       ThreadSleep ts2 = new ThreadSleep();
       ts1.start();
       ts2.start();
    }
}
