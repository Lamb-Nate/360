
package Threadsdemo;


public class thread extends Thread{
     public void run() {
        System.out.println("Another thread "+Thread.currentThread().getName()
                + " extending Thread class!");
    }

    
}
