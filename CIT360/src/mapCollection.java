import java.util.*; 
public class mapCollection {
	public static void main(String args[]) 
	   { 
	       Map< String,Integer> m =new HashMap< String,Integer>(); 
	       m.put("alpha", new Integer(1)); 
	       m.put("beta", new Integer(2)); 
	       m.put("charlie", new Integer(3)); 
	       m.put("delta", new Integer(4)); 
	  
	       // output     
	       Set< Map.Entry< String,Integer> > st = m.entrySet();    
	  
	       for (Map.Entry< String,Integer> me:st) 
	       { 
	           System.out.print(me.getKey()+":"); 
	           System.out.println(me.getValue()); 
	       } 
	   } 

}
