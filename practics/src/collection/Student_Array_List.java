package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Student_Array_List {

	
	public static void main(String[] args) 
		// TODO Auto-generated method stub

	/*
		ArrayList<String> al=new ArrayList<>();
		al.add("Rajashree");
		al.add("Digambar");
		al.add("Aadira");
		
		System.out.println("Using For Loop");
		for(int i=0;i<al.size();i++)
		{
			
			System.out.println("Student : "+ al.get(i));
			
		}
		
	*/
		
	
	
	
	
	

     {
	        ArrayList<String> list1 = new ArrayList<String>();
	        list1.add("JAVA");
	        list1.add("Python");
	        list1.add("C");
	            
	        ArrayList<String> list2 = new ArrayList<String>();
	        list2.add("C++");
	        list2.add("Data Science");
	        
	        list1.removeAll(list2);
	            
	        for(String name : list1)
	        {
	            System.out.println("Names from list = "+name);
	        }
	    }
	}
