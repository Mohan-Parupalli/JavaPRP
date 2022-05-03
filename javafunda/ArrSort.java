package javafunda;
import java.util.*;
public class ArrSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j] > a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				else
				{
					continue;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
