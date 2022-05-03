import java.util.*;
public class Lambda2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohan");
		al.add("Pratap");
		al.add("Ganesh");
		al.add("Lakshman");
		al.add("Shiva");
		al.forEach(n -> 
		{
		             StringBuffer sb=new StringBuffer(n);
		             sb.reverse();
		             System.out.print(sb+" ");
		}      		 
		             );
		
		            	
		// TODO Auto-generated method stub

	}

}
