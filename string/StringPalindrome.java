package string;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int flag=0;
		int len=str.length();
	   for(int i=0;i<(len-1)/2;i++)
		{
			if(str.charAt(i) != str.charAt(len-1))
			{
				flag=1;
				break;
			}
			else
			{  
				len--;
				
			}
			
		}
	     if(flag == 0)
	     {
	    	 System.out.println(str+" is a Palindrome");
	     }
	     else
	     {
	    	 System.out.println(str+" is not a Palindrome");
	     }
	     
		// TODO Auto-generated method stub
        sc.close();
	}

}
