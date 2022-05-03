package exceptionhandling;
import java.util.*;
import java.util.InputMismatchException;

public class Age {
	
	public void ageVerification(int a) throws InvalidAgeException
	{
		if(a < 18 | a > 60)
		{
			throw new InvalidAgeException("Age should be in between 18 & 60 ");
		}
		else
		{
			System.out.println("You are Eligible");
		}
	}

	public static void main(String[] args) {
		Age a=new Age();
		Scanner sc=new Scanner(System.in);
		
		try
		{
		  String name=sc.nextLine();
		  int age=Integer.parseInt(sc.nextLine());
		  a.ageVerification(age);	
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(InvalidAgeException ie)
		{
			System.out.println(ie);
		}
		// TODO Auto-generated method stub

	}

}
