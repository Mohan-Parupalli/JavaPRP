package javafunda;
import java.util.*;
public class Min2Max2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= new int[5];
		int min1,min2,max1,max2;
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
		min1=a[0];
		min2=a[1];
		max1=a[a.length-1];
		max2=a[a.length-2];
		
		
	
	System.out.println("min1 is : "+min1+" min2 is : "+min2+" max1 is : "+max1+" max2 is : "+max2);
		
		// TODO Auto-generated method stub
	  sc.close();

	}

}
