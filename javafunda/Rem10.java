package javafunda;
import java.util.*;
public class Rem10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == 10)
			{
				
				a[i]=0;
			}
		}
		
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != 0)
			{
				b[k]=a[i];
				k++;
			}
		}
		
		for(int i=k;i<a.length;i++)
		{
			b[i]=0;
		}
		for(int i : b)
		{
			System.out.print(i+" ");
		}
		// TODO Auto-generated method stub
		sc.close();

	}

}
