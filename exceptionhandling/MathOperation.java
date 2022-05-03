package exceptionhandling;
import java.util.*;
public class MathOperation {
	static int sum=0;
	static double avg;
	public static void sum(int s[]) throws ArithmeticException,InputMismatchException,NumberFormatException
	{
		
		for(int i: s)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
			
	}
	public static void average(int c) throws ArithmeticException
	{
		avg=sum/c;
		System.out.println(avg);
	}
         
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int count=0;
		try
		{
		try 
		{
		for(int i=0;i<5;i++)
		{
			a[i]=Integer.parseInt(sc.nextLine());
			count++;
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
			count=0;
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			count=0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			count=0;
		}
		sum(a);
		average(count);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Major Catch Block");
			System.out.println(e);
		}
		
		// TODO Auto-generated method stub
       sc.close();
	}

}
