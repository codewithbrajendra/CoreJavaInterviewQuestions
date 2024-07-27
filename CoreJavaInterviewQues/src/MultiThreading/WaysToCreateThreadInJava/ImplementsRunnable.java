package MultiThreading.WaysToCreateThreadInJava;

public class ImplementsRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running..............");
    }

    public static void main(String[] args) {
        ImplementsRunnable ir = new ImplementsRunnable();
        Thread thread = new Thread(ir); // Using the constructor Thread(Runnable r)
        thread.start();
        System.out.println("Main Thread is Running..........");
    }
  //  Note :- If you are not extending the Thread class, your class object would not be treated as a thread object. So you need to
    //  explicitly create the Thread class object. We are passing the object of your class that implements Runnable so that your
    //  class run() method may execute.
}
