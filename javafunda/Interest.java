package javafunda;
import java.util.*;
public class Interest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String G=sc.nextLine();
		int a=sc.nextInt();
		if(G.equals("Female"))
		{
			if(a >= 1 & a <=58 )
			{
				System.out.println("The Percentage of Interest is 8.2%");
			}
			else if(a >= 59 & a <= 100)
			{
				System.out.println("The Percentage of Interest is 9.2%");
			}
		}
		else if(G.equals("Male"))
		{
			if(a >= 1 & a <=58 )
			{
				System.out.println("The Percentage of Interest is 8.4%");
			}
			else if(a >= 59 & a <= 100)
			{
				System.out.println("The Percentage of Interest is 10.5%");
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
