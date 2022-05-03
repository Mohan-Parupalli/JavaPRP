package collection;
import java.util.*;
public class Numbers {

	public static void main(String[] args) {
	     ArrayList<Number> in=new ArrayList<Number>();
		in.add(55);
		in.add(112.67);
		in.add(109092.6);
//		in.add("Anitesh");  this gives an error as the object is string
		Iterator<Number> it=in.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		// TODO Auto-generated method stub

	}

}
