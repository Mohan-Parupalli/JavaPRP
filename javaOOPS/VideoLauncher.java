package javaOOPS;
import java.util.*;
public class VideoLauncher{

	public static void main(String[] args) {
		
		VideoStore vs=new VideoStore();
		
		Scanner sc=new Scanner(System.in);
		int x = 1;
		while(x > 0)
		{
			System.out.println("MAIN MENU");
			System.out.println("==========");
			System.out.println("1.Add Videos : ");
			System.out.println("2.Check Out Video : ");
			System.out.println("3.Return Video : ");
			System.out.println("4.Receive Rating : ");
			System.out.println("5.List Inventory : ");
			System.out.println("6.Exit : ");
			System.out.print("Enter your choice (1..6) : ");
			x=Integer.parseInt(sc.nextLine());
		if(x == 1)
		{
			System.out.print("Enter the name of the video you want to add : ");
			String name=sc.nextLine();
			vs.addVideo(name);
			
		}
		else if(x == 2)
		{
			System.out.print("Enter the name of the video you want to check out : ");
			String name=sc.nextLine();
			vs.doCheckout(name);
			
		}
		else if(x == 3)
		{
			System.out.print("Enter the name of the video you want to return : ");
			String n=sc.nextLine();
			vs.doReturn(n);
		}
		else if(x == 4)
		{
			System.out.print("Enter the name of the video you want to Rate : ");
			String n=sc.nextLine();
			System.out.println();
			System.out.print("Enter the rating for this video : ");
			int r=Integer.parseInt(sc.nextLine());
			vs.receiveRating(n,r);
		}
		else if(x == 5)
		{
			vs.listInventory();
		}
		else if(x == 6)
		{
			System.out.println("Exiting...!! Thanks for using the application.");
			break;
		}
			
		}
		
			
		sc.close();
		
		
		// TODO Auto-generated method stub

	}

}
