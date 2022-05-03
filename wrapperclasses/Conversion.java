package wrapperclasses;
import java.util.*;
public class Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Given Number :"+num);
		System.out.println("Binary eqivalent :"+Integer.toBinaryString(num));
		System.out.println("Octal eqivalent :"+Integer.toOctalString(num));
		System.out.println("Hexadecimal eqivalent :"+Integer.toHexString(num));
		sc.close();
		// TODO Auto-generated method stub

	}

}
