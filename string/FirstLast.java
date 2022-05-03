package string;
import java.util.*;
public class FirstLast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer s=new StringBuffer(sc.nextLine());
		s.delete(0, 1);
		s.delete(s.length()-1, s.length());
		System.out.println(s);
		sc.close();
		// TODO Auto-generated method stub

	}

}
