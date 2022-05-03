package collection;
import java.util.*;
public class VectoEnu {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(55);
		v.add(11);
		v.add(33);
		v.add(99);
		Enumeration<Integer> e=v.elements();
		System.out.println("Using Enumertion");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		System.out.println("Using Iterator");
		Iterator<Integer> it=v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ListIterator<Integer> li=v.listIterator();
		System.out.println("Forward Traverse using list iterator");
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("Backward Traverse using list iterator");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		// TODO Auto-generated method stub

	}

}
