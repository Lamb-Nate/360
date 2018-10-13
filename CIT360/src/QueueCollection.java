import java.util.*;
public class QueueCollection {
	public static void main(String[] args) 
	  { 
		//creates the queue
	    Queue<Integer> q = new LinkedList<>(); 
	  
	    // populates the Queue
	    for (int i=0; i<5; i++) 
	     q.add(i); 
	  
	    // lists the queue
	    System.out.println("The queue is-"+q); 
	  
	    // this removes an item from the queue. Since 0 was put in the queue first it is removed. 
	    int removedele = q.remove(); 
	    System.out.println("removed element-" + removedele); 
	  
	    //With item removed this showes current state of the Queue.
	    System.out.println(q); 
	  
	    // displays the first item
	    int head = q.peek(); 
	    System.out.println("first item in the queue-" + head); 
	  
	    
	  } 
}
