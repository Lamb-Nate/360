import java.util.*;
public class setCollection {
	 public static void main(String[] args) 
	    { 
	        // using HashSet 
	        Set<String> hash_Set = new HashSet<String>(); 
	        hash_Set.add("apple"); 
	        hash_Set.add("orange"); 
	        hash_Set.add("apple"); 
	        hash_Set.add("bannana"); 
	        hash_Set.add("kiwi"); 
	        
	        System.out.println(hash_Set);
	        
	        //apple is only listed on the output because duplicates are ignored.
	    }
}
