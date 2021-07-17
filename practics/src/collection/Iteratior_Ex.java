package collection;


import java.util.ArrayList;
import java.util.Iterator;

/*public class Iteratior_Ex {
	
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("HTML5");
		al.add("CSS3");
		
		System.out.println("Using For Loop ");
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println("Language : "+ al.get(i));
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String> it = 	al.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Language "+ it.next());
		}
	}
}





*/
import java.util.ArrayList;
import java.util.Iterator;
//public class IteraableEx {
public class Iteratior_Ex {
	
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Python");
		al.add("HTML5");
		al.add("CSS3");
		
		System.out.println("Using For Loop ");
		
		/*for(int i=0; i<al.size(); i++)
		{
			System.out.println("Language : "+ al.get(i));
		}
		*/
		System.out.println("Using Iterator");
		
		Iterator<String> it = 	al.iterator();
		
		while(it.hasNext())
		{
			System.out.println("Language "+ it.next());
		}
		
		String a = al.remove(2);
		
		System.out.println("the element "+ a + "is removed ");
		
		System.out.println("After removing the element "+ al);
		
	}
}
