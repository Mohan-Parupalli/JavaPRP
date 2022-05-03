package string;
import java.util.*;
public class Ncopies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  StringBuffer s=new StringBuffer(sc.nextLine());
	     int len=s.length();
	     s.delete(2, len);
	    StringBuffer sb=new StringBuffer(s);
	    for(int i=0;i<len-1;i++)
	    {
	    	sb.append(s.toString());
	    }
	    System.out.println(sb);
		
		// TODO Auto-generated method stub
         sc.close();
	}

}
