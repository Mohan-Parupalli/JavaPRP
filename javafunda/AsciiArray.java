package javafunda;
import java.util.*;
public class AsciiArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			char ch=(char)arr[i];
			System.out.print(ch+" ");
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
