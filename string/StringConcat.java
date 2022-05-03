package string;
import java.util.*;
public class StringConcat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer sb1=new StringBuffer(sc.nextLine());
		StringBuffer sb2=new StringBuffer(sc.nextLine());
		int len1=sb1.length();
		int len2=sb2.length();
		if(sb1.charAt(len1 -1) == sb2.charAt(0))
		{
			
			sb1.replace(len1-1, len2, sb2.toString());
			System.out.println(sb1);
			
		}
		else
		{
			System.out.println(sb1.append(sb2));
		}
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
