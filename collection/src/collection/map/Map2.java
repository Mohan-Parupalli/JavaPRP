package collection.map;
import java.util.*;
public class Map2 {
	TreeMap<String,Integer> contactList=new TreeMap<String,Integer>();
	 public void addPair(String Name,int Num)
	    {
	    	if(contactList.containsKey(Name))
	    	{
	    		
	    		return; 
	    		
	    	}
	    	
	    	contactList.put(Name, Num);  
	    	System.out.println("Pair Added Successfully");
	    	
	    }
	public int getNumber(String cName)
	{
		if(contactList.containsKey(cName))
		{
			return contactList.get(cName);
		}
		return 0;
	}
	public String getName(int Num)
	{
		if(contactList.containsValue(Num))
		{
		   for(Map.Entry<String,Integer> me : contactList.entrySet())
		   {
			   if((me.getValue()).equals(Num))
			   {
				   return me.getKey();
			   }
		   }
		}
		return "Number not matching any Contact";
	}
	public void printAll()
	{
		 for(Map.Entry<String,Integer> me : contactList.entrySet())
		 {
			 System.out.println(me.getKey()+"  :  "+me.getValue());
		 }
	}

	public static void main(String[] args) {
		Map2 m=new Map2();
		m.addPair("Mohan", 123);
		m.addPair("Surya", 456);
		m.addPair("Satya", 789);
		System.out.println(m.getName(123));
		System.out.println(m.getName(777));
		System.out.println(m.getNumber("Surya"));
		System.out.println(m.getNumber("Satya"));
		m.printAll();
		
		// TODO Auto-generated method stub

	}

}
