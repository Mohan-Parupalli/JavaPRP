package javafunda;

import java.util.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
				 
		Scanner sc=new Scanner(System.in);
		
		 String s1= args[0];
		
		 String s2= args[1];
		 
		 System.out.println(s1);
		 System.out.println(s2);
		 
		 if(s1.equals("Wipro") && s2.equals("Banglore"))
		 {
			 System.out.println(s1 +" "+"Technologies"+" "+s2);
		 }
		 else if(s1.equals("ABC") && s2.equals("Mumbai"))
		 {
			 System.out.println(s1 +" "+"Technologies"+" "+s2);
		 }
		 else
		 {
			 System.out.println("No command line arguments");
		 }
		sc.close();
		

	}
		// TODO Auto-generated method stub

	}


