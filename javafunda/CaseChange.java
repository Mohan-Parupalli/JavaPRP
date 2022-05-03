package javafunda;
import java.util.*;
public class CaseChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int r1;
		char r2;
		if(ch >=65 & ch <= 90)
		{
			 r1 =  ch + 32;
			 r2=(char)r1;
			
			System.out.println(r2);
		}
		else if(ch >= 97 & ch <= 122 )
		{
			r1= ch-32;
			r2=(char)r1;
			System.out.println(r2);
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
