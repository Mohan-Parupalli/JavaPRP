package javafunda;
import java.util.*;
public class Search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched : ");
		int s=sc.nextInt();
		int flag=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == s)
			{
				System.out.println(i);
				flag=0;
				break;
			}
			else
			{
			   flag=1;	
			}
		}
		if(flag == 1 )
		{
			System.out.println("-1");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
