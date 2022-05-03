package string;
import java.util.*;
public class Xchars {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer(sc.nextLine());
		if(s.charAt(0)=='x' & s.charAt(s.length()-1)=='x')
		{
			s.delete(0, 1);
			s.delete(s.length()-1, s.length());
			System.out.println(s);
		}
		else
		{
			System.out.println(s);
		}
		// TODO Auto-generated method stub
        sc.close();
	}

}
