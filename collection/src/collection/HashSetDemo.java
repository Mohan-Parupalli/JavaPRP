package collection;
import java.util.*;
public class HashSetDemo {
	HashSet<String> set=new HashSet<String>();
	
	public boolean addCountry(String countryName)
	{
	    if(set.contains(countryName))
	    {
	    	System.out.print("Country already Exists in the set -- ");
	    	return false;
	    }
	    else
	    {
	    	set.add(countryName);
	        return true;
	    }
	}
	public String findCountry(String countryName)
	{
		if(set.contains(countryName))
			return countryName;
		return "Country Not Found";
	}
	public void printAllCountries()
	{
		
//		Enumeration<String> en=set.elements();
		System.out.println("Using Iterator : ");
		Iterator<String> it=set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		System.out.println("Using ListIterator : ");
//		ListIterator<String> li=;
		
	}

	public static void main(String[] args) {
		HashSetDemo hd=new HashSetDemo();
		System.out.println(hd.addCountry("India"));
		System.out.println(hd.addCountry("US"));
		System.out.println(hd.addCountry("Russia"));
		System.out.println(hd.addCountry("India"));
		System.out.println(hd.findCountry("US"));
		System.out.println(hd.findCountry("Australia"));
		hd.printAllCountries();
		
		
		// TODO Auto-generated method stub

	}

}
