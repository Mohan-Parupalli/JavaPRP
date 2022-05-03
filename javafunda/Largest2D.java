package javafunda;
import java.util.*;
public class Largest2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int count=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=sc.nextInt();
				count++;
			}
		}
		if(count < 9)
		{
			System.out.println("Please enter 9 integer numbers ");
		}
		else {
		int max=a[0][0];
		int temp;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(max < a[i][j])
				{
					temp=a[i][j];
					a[i][j]=max;
					max=temp;
				}
				
			}
		}
		System.out.println("The Largest Number in the 2D array is : "+max);
		}
		sc.close();
		// TODO Auto-generated method stub

	}
	
}
