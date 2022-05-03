package wrapperclasses;
import java.util.*;
public class Employee implements Cloneable{
	int a;
	double b;
	
	Employee cloneTest()
	{
		try
		{
		return (Employee)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Cloning Not Allowed");
			return this;
		}
	}
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.a=10;
		e1.b=12.2;
		e2=e1.cloneTest();
		System.out.println("before changing the values :");
		System.out.println("e1.a = "+e1.a);
		System.out.println("e1.b = "+e1.b);
		System.out.println("e2.a = "+e2.a);
		System.out.println("e2.b = "+e2.b);
		e1.a=5;
		e1.b=7.5;
		System.out.println("After changing the values :");
		System.out.println("e1.a = "+e1.a);
		System.out.println("e1.b = "+e1.b);
		System.out.println("e2.a = "+e2.a);
		System.out.println("e2.b = "+e2.b);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
