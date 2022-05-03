package javafunda;
import java.util.*;
public class MidElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		int b[]=new int[3];
		int mid[]=new int[2];
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			if(i == 1)
			{
				mid[i-1]=a[i];
				mid[i]=b[i];
			}
		}
		System.out.println("Array a is : "+Arrays.toString(a));
		System.out.println("Array b is : "+Arrays.toString(b));
		System.out.println("Array Mid is : "+Arrays.toString(mid));
		// TODO Auto-generated method stub
		sc.close();

	}

}
