package optionalclass;
import java.util.Optional;

class InvalidEmployeeException extends Exception
{
	public InvalidEmployeeException()
	{
		//super(s);
	}
}
public class Employee {

	public static void main(String[] args) throws InvalidEmployeeException {
		// TODO Auto-generated method stub
        Employee e=null;
        
        Optional<Employee> op=Optional.ofNullable(e);
        System.out.println(op.orElseThrow(InvalidEmployeeException::new));
	}

}
