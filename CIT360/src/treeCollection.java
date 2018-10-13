import java.util.*; 
public class treeCollection {
	public static void main(String args[]) 
    { 
		//Creates the string
        TreeSet<String> ts1 = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts1.add("Beta"); 
        ts1.add("Charlie"); 
        ts1.add("alpha"); 
        
        Iterator<String> itr=ts1.iterator();  
        while(itr.hasNext()){  
   
        System.out.println(itr.next()); 
    } 

        
    }
}
