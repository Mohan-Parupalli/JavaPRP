package javafunda;
import java.util.*;
public class Args {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[5];
		int i=0;
		int n=1;
		while(n == 1)
		{
			String str=sc.nextLine();
			
			if(str.isEmpty())
			{
				System.out.println("No Values");
				break;
			}
			else
			{
				arr[i]=str;
				i++;
				if(i == 5)
				{
					break;
				}
			}
		}
		for(int j=0;j<i;j++)
		{
			System.out.print(arr[j]);
			if(j < i-1)
			  System.out.print(",");
		}
		// TODO Auto-generated method stub
		sc.close();

	}

}
