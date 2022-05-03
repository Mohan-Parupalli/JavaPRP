package iostreams.serialliztion;
import java.io.*;
public class EmployeeDeserializtion {

	public static void main(String[] args) {
		Employee de;
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("C:\\Users\\MOHAN\\Desktop\\data.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			de=(Employee) ois.readObject();
			System.out.println("After deserializtion : ");
			System.out.println(de.getName());
			System.out.println(de.getD());
			System.out.println(de.getDepartment());
			System.out.println(de.getDesignation());
			System.out.println(de.getSalary());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
