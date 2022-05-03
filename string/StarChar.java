package string;
import java.util.*;
public class StarChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer(sc.nextLine());
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i) == '*')
			{
				if(i == 0)
				{
					s.delete(i,1);
				}
				else
				{
					s.delete(i-1, i+2);
					
				}
			}
		}
		System.out.println(s);
		sc.close();
		// TODO Auto-generated method stub

	}

}
