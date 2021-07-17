package collection;

import java.util.ArrayList;

public class SetGetMethod {

	
	private String name;
	private int age;
       SetGetMethod()
{
	
}
       
   	
public void setName(String name)
{
this.name=name;
}

public String getName()
{
return name;
}

public void setAge(String name)
{
this.age=age;
}

public int getAge()
{
return age;
}

class Arraylaist
{
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// SetGetMethod s=new  SetGetMethod();
	Arraylaist ars=new Arraylaist();
	 
	 ArrayList <SetGetMethod> as=new ArrayList();

		
		as.add(new SetGetMethod ("Java",12));
		as.add(new SetGetMethod ("Python"11));
		

}}}
	

