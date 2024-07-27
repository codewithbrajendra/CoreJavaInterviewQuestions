package MultiThreading;

public class JoinThread extends Thread{

    public void run()
    {
        for (int j = 0; j < 2; j++)
        {
            try
            {
// sleeping the thread for 300 milli seconds
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }
// catch block for catching the raised exception
            catch(Exception e)
            {
                System.out.println("The exception has been caught: " + e);
            }
            System.out.println( j );
        }
    }

    public static void main(String[] args) {
        //The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait until the other
        // thread to finish its execution.
        //When there are more than one thread invoking the join() method, then it leads to overloading on the join() method that
        // permits the developer or programmer to mention the waiting period.

        // creating 3 threads
        JoinThread th1 = new JoinThread();
        JoinThread th2 = new JoinThread();
        JoinThread th3 = new JoinThread();

// thread th1 starts
        th1.start();

// starting the second thread after when
// the first thread th1 has ended or died.
        try
        {
            System.out.println("The current thread name is: "+ Thread.currentThread().getName());

// invoking the join() method
            th1.join();
        }

// catch block for catching the raised exception
        catch(Exception e)
        {
            System.out.println("The exception has been caught " + e);
        }

// thread th2 starts
        th2.start();

// starting the th3 thread after when the thread th2 has ended or died.
        try
        {
            System.out.println("The current thread name is: " + Thread.currentThread().getName());
            th2.join();
        }

// catch block for catching the raised exception
        catch(Exception e)
        {
            System.out.println("The exception has been caught " + e);
        }

// thread th3 starts
        th3.start();
    }
}

