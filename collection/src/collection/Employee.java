package collection;

public class Employee implements Comparable{
	int empID;
	String name;
	float salary;
	public Employee(int ID,String n,float sal)
	{
		empID=ID;
		name=n;
		salary=sal;
	}
   public int compareTo(Object o)
   {
	   Employee em=(Employee)o;
	   if(salary == em.salary)
	   {
		   return 0;
	   }
	   else if(salary > em.salary)
	   {
		   return 1;
	   }
	   else 
	   {
		   return -1;
	   }
   }
}
