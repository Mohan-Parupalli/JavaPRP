package javafunda;
import java.util.*;
public class Sum67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		int i1=0,i2=0;
		for(int i=0;i<10;i++)
		{
			if(a[i] == 6)
			{
				i1=i;
				
			}
			else if(a[i] == 7)
			{
				i2=i;
			}
		}
		int sum=0;
		if(i1 < i2)
		{
			for(int i=0;i<10;i++)
			{
				if(i == i1)
				{
					i=i+(i2-i1)+1;
				}
				sum=sum+a[i];
				
			}
			System.out.println(sum);
		}
		else
		{
			for(int i=0;i<10;i++)
			{
			sum=sum+a[i];
			
			}
			System.out.println(sum);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
