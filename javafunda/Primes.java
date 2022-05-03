package javafunda;
//import java.util.*;
public class Primes {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int num=10;
		
		while(num < 100)
		{
			int flag=0;
		for(int i=2;i<num/2;i++)
		{
			//System.out.println("Hi1");
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
		//System.out.println("Hi1");
		if(flag == 0)
		{
		System.out.println(num+" is  a Prime Number");
		}
		
		num=num+1;
		}
		
		// TODO Auto-generated method stub

	}

}
