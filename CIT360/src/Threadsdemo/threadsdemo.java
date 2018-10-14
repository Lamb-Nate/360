
package Threadsdemo;

public class threadsdemo {
     public static void main(String[] args)
     {
         //Create a thread -runnable
         (new Thread(new runnable())).start();
         
         //Create a thread -extends Thread
         (new thread()).start();
         //Create a runnable object 
         Runnable r1 = new Runnable()
         {
             @Override
             public void run()
             {
                 
                 System.out.println("Another thread "+
                         Thread.currentThread().getName());
             }
         };
         
         Runnable r2 = () -> System.out.println("Another thread "
                 + Thread.currentThread().getName());
         
         
         
         Thread t1 = new Thread(r1, "Thread t1");
         t1.start();
         


         Thread t2 = new Thread(r2);
         
         t2.start();
         }
    }

    


