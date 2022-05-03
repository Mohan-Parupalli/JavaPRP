package string;
import java.util.*;
public class LongShort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		StringBuffer s=new StringBuffer();
		if(a.length() < b.length())
		{
			s.append(a);
			s.append(b);
			s.append(a);
			System.out.println(s);
		}
		else
		{
			s.append(b);
			s.append(a);
			s.append(b);
			System.out.println(s);
			
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
