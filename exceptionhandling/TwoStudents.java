package exceptionhandling;
import java.util.*;
public class TwoStudents {
	public static void details() throws NegativeInputException,RangeMismatchException,NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		String n[]=new String[2];
		System.out.println("Enter the names of 2 students : ");
		for(int i=0;i<2;i++)
		{
			n[i]=sc.nextLine();
		}
		System.out.println("Enter the 3 subject marks of each student");
		int m[]=new int[6];
		for(int i=0;i<6;i++)
		{
			int x=sc.nextInt();
			
			if(x < 0)
			{
				throw new NegativeInputException("Input should be positive");
			}
			else if( x > 100)
			{
				throw new RangeMismatchException("Value should be within range");
			}
			else
			{
				
				m[i]=x;
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<6;i++)
		{
			if(i<3)
			{
				sum1=sum1+m[i];
			}
			else
			{
				sum2=sum2+m[i];
			}
		}
		double avg1=sum1/3;
		double avg2=sum2/3;
		System.out.println("Average of student 1 "+n[0]+" is : "+avg1);
		System.out.println("Average of student 2 "+n[1]+" is : "+avg2);
		
	}

	public static void main(String[] args) {
		
		try
		{
			details();
		}
		catch(NegativeInputException ne)
		{
			System.out.println("Catch block 1");
			System.out.println(ne.getMessage());
		}
		catch(RangeMismatchException re)
		{
			System.out.println("Catch block 2");
			System.out.println(re.getMessage());
		}
				// TODO Auto-generated method stub

	}

}
