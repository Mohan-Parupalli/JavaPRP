package javafunda;
import java.util.*;

public class TwoDRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[2][2];
		System.out.println("Enter the 2D Array Elements : ");
		int count=0;
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.nextInt();
				count++;
			}
		}
		if(count < 4)
		{
			System.out.println("Please enter 4 integer numbers : ");
		}
		int rev[][]=new int[2][2];
		int r=0,c=0;
		for(int i=1;i>=0;i--)
		{
			
			for(int j=1;j>=0;j--)
			{   
				if(i == 0)
				{
					r=1;
				}
				if(i == 1)
				{
					r=0;
				}
				if( j == 0)
				{
					c=1;
				}
				if(j == 1)
				{
					c=0;
				}
				
				rev[r][c]=arr[i][j];
				
				
			}
						
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(rev[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
