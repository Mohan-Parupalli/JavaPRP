package javafunda;
import java.util.*;
public class EvenOddArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int k=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==0)
				{
					if(a[j]%2 == 0)
					{
						b[k]=a[j];
						k++;
					}
				}
				else if(i == 1)
				{
					if(a[j]%2 != 0)
					{
						b[k]=a[j];
						k++;
					}
				}
					
					
			}
		
		}
		for(int i: b)
		{
			System.out.print(i+" ");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
