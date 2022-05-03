package iostreams;
import java.io.*;
import java.util.Arrays;
import java.util.*;
public class OccurenceCount {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
	     FileReader in=null;
	    // File f=new File(sc.nextLine());
		try
		{
			in=new FileReader("C:\\Users\\MOHAN\\Desktop\\count.txt");
			BufferedReader br=new BufferedReader(in);
			
			String s;
			String str[];
			TreeMap<String,Integer> tm= new TreeMap<String,Integer>();
			int count=0;
			while((s = br.readLine()) != null)
			{
				str=(s.split("[ ]+"));
				
				for(String st : str)
				{
					if(tm.containsKey(st))
					{
						count=tm.get(st);
						count=count+1;
						tm.put(st,count);
					}
					else
					{
						tm.put(st, 1);
					}
				}
				
			}
			for(Map.Entry<String, Integer> me: tm.entrySet() )
			{
				System.out.println(me.getKey()+" : "+me.getValue());
				
			}
			
			
			
		}
		finally
		{
			if(in != null)
			{
				in.close();
			}
			
		}
		// TODO Auto-generated method stub

	}

}
