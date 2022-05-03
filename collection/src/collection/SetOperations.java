package collection;
import java.util.*;
public class SetOperations {
               
               
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("India");
		ts.add("Australia");
		ts.add("Russia");
		ts.add("America");
		ts.add("Vietnam");
		System.out.println("Before the reversal");
        Iterator<String> it=ts.iterator();
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
//        NavigableSet<String> treerev=ts.descendingSet();
        List<String> al=new ArrayList<String>(ts);
        Collections.reverse(al);
        System.out.println();
       System.out.println("After the reversal");
  
        Iterator<String> it1=al.iterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }
        System.out.println();
        System.out.println("India is an element of TreeSet : ");
        System.out.println(ts.contains("India"));
        
        
        // TODO Auto-generated method stub

	}

}
