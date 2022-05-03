package javafunda;
import java.util.*;
public class Value {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n < 0)
		{
			System.out.println(n+" is negative");
		}
		else if(n > 0)
		{
			System.out.println(n+" is postive");
		}
		else
		{
			System.out.println(n+" is zero");
		}
		// TODO Auto-generated method stub
		sc.close();

	}

}
