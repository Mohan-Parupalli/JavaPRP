package collection;
import java.util.*;


public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Employee> ts=new TreeSet<Employee>();
		ts.add(new Employee(1,"Viraj",32000.68f));
		ts.add(new Employee(2,"Virat",2000.68f));
		ts.add(new Employee(3,"Vivek",72000.68f));
		ts.add(new Employee(4,"Vinod",55000.68f));
		Iterator<Employee> it=ts.iterator();
		while(it.hasNext())
		{
			Employee emp=(Employee)it.next();
			System.out.println(emp.empID+" : "+emp.name+" : "+emp.salary);
		}
		
		
		// TODO Auto-generated method stub

	}

}
