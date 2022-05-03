package collection.map;

import java.util.HashMap;
import java.util.*;

public class Map1 {
	HashMap<String,String> mapObj=new HashMap<String,String>();
	
    public String saveCountryCapital(String countryName,String capital)
    {
    	if(mapObj.containsKey(countryName))
    	{
    		return "Country already exists in the Map";  
    		
    	}
    	mapObj.put(countryName, capital);
        return "Country Registered Succesfully";	 
    	
    }
    public String getCapital(String countryName)
    {
    	if(mapObj.containsKey(countryName))
    	{
    		
    		return mapObj.get(countryName);
    	}
    	return "No Capital Found";
    }
    public String getCountry(String capital)
    {
    	if(mapObj.containsValue(capital))
    	{
//    		Map.Entry<String, String> set=mapObj.entrySet();
//    		Iterator it=set.iterator();
//    		while(it.hasNext())
//    		{
//    			Map.Entry me=(Map.Entry)it.next();
//    			if(me.getValue().equals(capital))
//    			{
//    				
//    				return (String)me.getKey();
//    			}
//    		}
    		for(Map.Entry<String, String> me : mapObj.entrySet())
    		{
    			if(me.getValue().equals(capital))
    				return me.getKey();
    		}
    				
    	}
	    return "No Capital Found";
    	
    }
    public HashMap<String,String> newMap()
    {
    	HashMap<String,String> mapObj2=new HashMap<String,String>();
    	String newKey;
    	String newVal;
    	for(Map.Entry<String, String> me : mapObj.entrySet())
    	{
    	     newKey=me.getValue();
    	     newVal=me.getKey();
    	     mapObj2.put(newKey,newVal);
    	}
    	return mapObj2;
    }
    public ArrayList<String> countryList()
    {
    	ArrayList<String> cl=new ArrayList<String>();
    	for(Map.Entry<String, String> me : mapObj.entrySet())
    	{
    		cl.add(me.getKey());
    	}
    	return cl;
    }
    public ArrayList<String> capitalList()
    {
    	ArrayList<String> al=new ArrayList<String>();
    	for(Map.Entry<String, String> me : mapObj.entrySet())
    	{
    		al.add(me.getValue());
    	}
    	return al;
    }
    
    
	public static void main(String[] args) {
		Map1 m=new Map1();
		System.out.println(m.saveCountryCapital("India","Delhi"));
		System.out.println(m.saveCountryCapital("Japan", "Tokyo"));
		System.out.println(m.getCapital("Japan"));
		System.out.println(m.getCountry("Delhi"));
		System.out.println(m.newMap());
		System.out.println(m.countryList());
	    System.out.println(m.capitalList());
	    
		
		// TODO Auto-generated method stub

	}

}
