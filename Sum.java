import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  Digit number : ");
		int num=sc.nextInt();
		int sum=0;
		while(num > 0)
		{
			sum = sum + num%10;
			num = num/10;
			
		}
		System.out.println("The sum of 4-Digit Number is : "+sum);
		sc.close();
		// TODO Auto-generated method stub

	}

}
