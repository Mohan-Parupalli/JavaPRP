package string;
import java.util.*;
public class Nrepetetions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer(sc.nextLine());
		int n=sc.nextInt();
		str.delete(0,str.length()-n);
		StringBuffer s=new StringBuffer();
		for(int i=0;i<n;i++)
		{
			s.append(str.toString());
		}
		System.out.println(s);
		// TODO Auto-generated method stub
		sc.close();

	}

}
