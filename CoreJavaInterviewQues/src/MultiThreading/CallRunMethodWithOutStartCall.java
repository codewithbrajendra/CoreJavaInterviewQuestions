package MultiThreading;

public class CallRunMethodWithOutStartCall extends Thread{

    public void run(){
        System.out.println("running...");
    }

    public static void main(String[] args) {
        //Each thread starts in a separate call stack.
        //Invoking the run() method from the main thread, the run() method goes onto the current call stack(Main method stack)
        // rather than at the beginning of a new call stack.
        CallRunMethodWithOutStartCall thread = new CallRunMethodWithOutStartCall();
        thread.run();//fine, but does not start a separate call stack
    }
}
