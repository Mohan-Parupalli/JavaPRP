package wrapperclasses;
import java.util.*;
public class BinaryPadding {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num > 0 & num <= 255 )
		{
			String str=String.format("%08d",Integer.parseInt(Integer.toBinaryString(num)));
			System.out.println(str);
		}
		
		sc.close();
		// TODO Auto-generated method stub

	}

}
