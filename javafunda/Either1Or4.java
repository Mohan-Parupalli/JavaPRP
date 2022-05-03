package javafunda;
import java.util.*;
public class Either1Or4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int flag=0;
		for(int i=0;i<5;i++)
		{
			if(a[i] == 1 || a[i] == 4)
			{
				continue;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag == 0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		sc.close();
			
		// TODO Auto-generated method stub

	}

}
