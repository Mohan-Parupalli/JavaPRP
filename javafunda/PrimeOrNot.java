package javafunda;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=num/2;i++)
		{
			
		    //flag=0;
			if(num % i != 0)
			{
				
				continue;
			}
			else
			{
				
				flag=1;
				break;
			}
			
		}
		if(flag == 1)
		{
			System.out.println(num+" is not Prime number");
		}
		else
		{
			System.out.println(num+" is  a prime number");
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
