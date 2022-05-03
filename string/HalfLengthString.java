package string;
import java.util.*;
public class HalfLengthString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer(sc.nextLine());
		if((s.length())%2 == 0)
		{
			s.delete(s.length()/2,s.length());
			System.out.println(s);
		}
		else 
		{
			System.out.println("null");
		}
		// TODO Auto-generated method stub
		sc.close();

	}

}
