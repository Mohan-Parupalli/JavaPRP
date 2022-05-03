package javafunda;
import java.util.*;
public class Asciival {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		//int a=c;
		if( c >= 48 & c <= 57)
		{
			System.out.println(c+" is a Digit");
		}
		else if(c >= 65 & c<= 90 )
		{
			System.out.println(c+" is an Alphabet");
		}
		else
		{
			System.out.println(c+" is a special Character");
		}
		//System.out.println(a);
		// TODO Auto-generated method stub
		sc.close();

	}

}
