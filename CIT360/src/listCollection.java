import java.util.*;
public class listCollection {
	public static void main (String[] args) 
    { 
        // Creates list 1
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);  // adds 1  
        l1.add(1, 2);  // adds 2
        l1.add(2, 3);  // adds 3
        l1.add(3, 4);  // adds 4
        l1.add(4, 5);  // adds 5
        System.out.println(l1);   
  
        // Create list 2
        List<Integer> l2 = new ArrayList<Integer>(); 
        l2.add(1); 
        l2.add(2); 
        l2.add(3); 
  
        // inserts list 2 atindex location 1 
        l1.addAll(1, l2); 
        System.out.println(l1); 
  
        
    } 
	

}
