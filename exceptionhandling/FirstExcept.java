package exceptionhandling;
import java.util.*;
public class FirstExcept {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=0;
		
		System.out.println("Enter size of the array : ");
		N=sc.nextInt();
		int arr[]=new int[N];
		System.out.println("Enter the elements in the array");
		try 
		{
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access ");
		int index=sc.nextInt();
		System.out.println(arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
