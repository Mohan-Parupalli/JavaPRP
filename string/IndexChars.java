package string;
import java.util.*;
public class IndexChars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer();
		String a=sc.nextLine();
		String b=sc.nextLine();
		int al=a.length();
		int bl=b.length();
		for(int i=0;i<(al<bl?al:bl);i++)
		{
			s.append(a.charAt(i));
			s.append(b.charAt(i));
			
		}
		StringBuffer str=new StringBuffer();
		
		if(al < bl)
		{
			str.append(b);
			str.delete(0, al);
			s.append(str.toString());
			
		}
		else
		{
			str.append(a);
			str.delete(0, bl);
			s.append(str.toString());
		}
		System.out.println(s);
		sc.close();
		// TODO Auto-generated method stub

	}

}
