package javafunda;
import java.util.*;
public class RemoveDup {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[6];
		int count=0;
		for(int i=0;i<6;i++)
		{
			a[i]=sc.nextInt();
		}
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len-i-1;j++)
			{
				System.out.println(a[i]+" "+a[j] );
				if(a[i] == a[j])
				{   
					int k=j;
					while(k < len-count-1)
					{
						a[k] = a[k+1];
						k++;
					}
					a[k]='\0';
					count++;
					j--;
					if(i == j)
					{
						j++;
					}
				}
			}
		}
		//System.out.println(Arrays.toString(a));
		len=len-count;
		for(int i=0;i<len;i++)
		{
			System.out.print(a[i]+" ");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
