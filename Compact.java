import java.util.*;
public class Compact {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String : ");
	String s=sc.next();
	int len =s.length();
	int count=0;
	for(int i=0;i<len/2;i++)
	{
		if(s.charAt(i) != s.charAt(len-i-1))
		{
			System.out.println(s+" is not a Palindrome");
			break;
		}
		else
		{
		count++;
		}
	}
	if(count == len/2)
	{
		System.out.println(s+" is a Palindrome");
	}
	
	
		// TODO Auto-generated method stub

	}

}
