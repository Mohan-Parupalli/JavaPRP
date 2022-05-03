package javafunda;
import java.util.*;
public class FloydsFormat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=0;
		while(x != n)
		{
			for(int i=0;i<= x;i++)
			{
				System.out.print("* ");
			}
			System.out.println();
			x++;
			
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
