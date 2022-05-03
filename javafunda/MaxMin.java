package javafunda;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=a[0],max=a[0];
		for(int i=0;i<5;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
			
		}
		for(int i=0;i<5;i++)
		{
			if(max < a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Minimum is : "+min+" Maximum is : "+max);
		sc.close();
		// TODO Auto-generated method stub

	}

}
