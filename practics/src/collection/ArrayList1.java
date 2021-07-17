package collection;

import java.util.ArrayList;
import java.util.List;
class Person
{
	private String name;
	private int age;


	Person()
	{

	}
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}	
	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}	
}
class ArrayList1
{

	public static void main(String args[])
	{
		
		ArrayList<Person> al = new ArrayList<>();
		
		al.add(new Person("AAA" , 12));
		al.add(new Person("ABC" , 12));
		al.add(new Person("CBA", 12));

		al.forEach(all-> {System.out.println("Name : "+ all.getName() + "   Age :"+ all.getAge());});	
		
		
	}
}