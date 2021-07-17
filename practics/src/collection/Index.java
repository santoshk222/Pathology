package collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Index {
    public static void main(String[] args) {
    
    	  List<String> names = new ArrayList<>();
    	  names.add("Harish");
          names.add("Sana");
          names.add("Deepti");
          names.add("Harish");
          names.add("Preeti");
          names.add("Gitanjali");
        
          names.add(3, "Reema");
        
          Collections.sort(names);
      
          

          
          System.out.println("Using For Loop ");
  		
  		for(int i=0; i< names.size(); i++)
  		{
  			System.out.println("Language : "+  names.get(i));
  		   // Collections.sort(names);
  		}
  		
  		System.out.println("\nUsing Iterator");
  		
  		Iterator<String> it = 	 names.iterator();
  		
  		while(it.hasNext())
  		{
  			System.out.println("Language "+ it.next());
  		}
  		
          String a =  names.remove(4);
  		
  		System.out.println("the element "+ a + " is removed ");
  		
  		System.out.println("After removing the element "+  names);
  		
  	}
  		
    }
         
 
