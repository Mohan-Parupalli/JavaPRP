package iostreams.serialliztion;
import java.util.*;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		
		Employee e=new Employee("Viraj","Inventory","Supply chain manager",75000);
		FileOutputStream fos=null;
		try
		{
		 fos=new FileOutputStream("C:\\Users\\MOHAN\\Desktop\\data.txt");
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(e);
		 oos.flush();
		 oos.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			if(fos != null)
			{
				fos.close();
			}
		}
		// TODO Auto-generated method stub

	}

}
