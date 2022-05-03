package iostreams;
import java.util.*;
import java.io.*;

public class SourceDestination {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		InputStream in=null;
	    OutputStream out=null;
	    System.out.println("Enter the Input File Name");
	    String input=sc.nextLine();
	    System.out.println("Enter the Output File Name");
	    String output=sc.nextLine();
	   // File f=new File();
		try
		{
			in=new FileInputStream(input);
			out=new FileOutputStream(output);
			int c;
			while((c = in.read()) != -1)
			{
				out.write(c);
			}
			System.out.println("File is Copied");
		}
		finally
		{
			if( in != null)
			{
				in.close();
			}
			if(out != null)
			{
				out.close();
			}
		}
		
		// TODO Auto-generated method stub

	}

}
