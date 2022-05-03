package iostreams;
import java.io.*;
import java.util.*;
public class CharCount {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the File name to be searched");
        String fName=sc.nextLine();
		InputStream in=null;
		try
		{
	     in=new FileInputStream(fName);
	     System.out.println("Enter the character to be counted");
	     char ch1=sc.next().charAt(0);
	     int c;
	     int count=0;
	     while((c = in.read()) != -1)
	     {
	    	 char ch2=(char)c;
	    	 char ch1upper=Character.toUpperCase(ch1);
	    	 int result1=Character.compare(ch1,ch2);
	    	 int result2=Character.compare(ch1upper,ch2);
	    	 if(result1 == 0)
	    	 {
	    		 count++;
	    	 }
	    	 else if(result2 == 0)
	    	 {
	    		 count++;
	    	 }
	     }
	     System.out.println("File "+fName+" has "+count+" instances of  "+ch1);
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
