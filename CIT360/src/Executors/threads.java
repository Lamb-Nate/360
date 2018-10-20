
package Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class threads {

    public static void main(String[] args) {
       
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {  
            Runnable worker = new worker("Thread " + i);  
            //calling execute method of ExecutorService
            executor.execute(worker);  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("all Threads Compleate");  
    }
  
}
