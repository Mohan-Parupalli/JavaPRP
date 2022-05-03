package streamAPI;
import java.util.*;
import java.util.stream.Collectors;
class Employee
{
	int empNo;
	String name;
	int age;
	String location;
	Employee(int e,String n,int a,String l)
	{
		empNo=e;
		name=n;
		age=a;
		location=l;
	}
}
public class Stream2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> el=new ArrayList<Employee>();
        el.add(new Employee(1,"Mohan",15,"Hyderabad"));
        el.add(new Employee(2,"Ganesh",13,"Delhi"));
        el.add(new Employee(3,"Pratap",10,"Pune"));
        el.add(new Employee(4,"Surya",5,"Banglore"));
        el.add(new Employee(5,"Lakshman",14,"Pune"));
        List<Employee> newList=el.stream().filter(emp -> emp.location=="Pune").collect(Collectors.toList());
        newList.forEach(e -> System.out.println(e.name));
	}

}
