import java.util.ArrayList;
public class Lambda3 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Mohan");
		al.add("Pratap");
		al.add("Ganesh");
		al.add("Lakshman");
		al.add("Shiva");
		al.forEach(n -> 
		{
		             if(n.length() % 2 != 0)
		                  System.out.print(n+" ");
		              
		}      		 
		 );
		
		            	
		// TODO Auto-generated method stub

	

}
}