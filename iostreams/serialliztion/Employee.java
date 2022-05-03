package iostreams.serialliztion;
import java.util.*;
import java.io.*;
public class Employee implements Serializable{
       String name;
       Date d;
       String department;
       transient String designation;
       static double Salary;
       public Employee()
       {
    	  
       }
       public Employee(String n,String dep,String des,double sal)
       {
    	   name=n;
    	   department=dep;
    	   designation=des;
    	   Salary=sal;
    	   d=new Date();
       }
       public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getD() {
		return d;
	}
	public void setD(Date d) {
		this.d = d;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
       
       
}
