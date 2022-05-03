package javafunda;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		int digit;
		int rev=0;
		while(temp > 0)
		{
			digit=temp%10;
			rev = rev*10 + digit;
			
			temp=temp/10;
			
		}
		System.out.println(rev);
		sc.close();
		// TODO Auto-generated method stub

	}

}
