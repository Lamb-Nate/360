
package Executors;

public class worker implements Runnable{
    private final String message;  


    public worker(String message){  
        this.message=message;  
    }  
    
    @Override
    
   public void run() {  
        System.out.println(Thread.currentThread().getName()+
                " (Start) message = " + message);  
        
        working();
        System.out.println(Thread.currentThread().getName()+
                " (End)");
    }  
    private void working() {  
        try {  Thread.sleep(2000);  } 
        catch (InterruptedException e) 
        { e.printStackTrace(); }  
    }  
}
