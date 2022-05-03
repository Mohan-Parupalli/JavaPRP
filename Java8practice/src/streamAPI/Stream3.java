package streamAPI;
import java.util.*;
//import java.util.stream.*;
class Student
{
	int rollNo;
	String name;
	int mark;
	Student(int rollNo,String name,int mark)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.mark=mark;
	}
	
}
public class Stream3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sl=new ArrayList<Student>();
		sl.add(new Student(1,"Mohan",45));
		sl.add(new Student(2,"Pratap",62));
		sl.add(new Student(3,"Ganesh",19));
		sl.add(new Student(4,"Shiva",93));
		sl.add(new Student(5,"Lakshman",37));
		
		long c=sl.stream().filter(stu -> stu.mark >= 50).count();
		System.out.println(c);

	}

}
