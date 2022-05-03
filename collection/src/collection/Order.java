package collection;
import java.util.*;
public class Order {
	public static void printAll(ArrayList<String> re)
	{
		Iterator<String> it=re.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("Mohan");
		al.add("Anitesh");
		al.add("Vinay");
		al.add("Pratap");
		
		printAll(al);
		// TODO Auto-generated method stub

	}

}
