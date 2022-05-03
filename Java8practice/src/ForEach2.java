import java.util.*;
class Employee
{
	int id;
	String name;
	String address;
	int salary;
	
}
public class ForEach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.id=1;
		e1.name="Mohan";
		e1.address="Kakinada";
		e1.salary=50000;
		
		Employee e2=new Employee();
		e2.id=2;
		e2.name="Pratap";
		e2.address="Vijayawada";
		e2.salary=60000;
		
		Employee e3=new Employee();
		e3.id=3;
		e3.name="Ganesh";
		e3.address="Sindhnur";
		e3.salary=70000;
		
		List<Employee> el=new ArrayList<Employee>();
		el.add(e1);
		el.add(e2);
		el.add(e3);
		
		el.forEach(n -> {
			System.out.println(n.id+" "+n.name+" "+n.address+" "+n.salary);
		});
		

	}

}
