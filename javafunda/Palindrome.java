package javafunda;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int digit;
		int rev=0;
		while(num > 0)
		{
			digit=num%10;
			rev=rev*10 + digit;
			num=num/10;
		}
		
		if(rev == temp)
		{
			System.out.println(temp+" is a Palindrome");
		}
		else
		{
			System.out.println(temp+" is not a Palindrome");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
