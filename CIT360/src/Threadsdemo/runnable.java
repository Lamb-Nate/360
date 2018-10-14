
package Threadsdemo;


public class runnable implements Runnable{
     public void run() {
        System.out.println("This is "+Thread.currentThread().getName()+" "
                + "Started using a runnable");
    }
    
}
