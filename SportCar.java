
public class SportCar extends Car {
	int airBaloonType;
	//SportCar()
	//{
		
	//}
	SportCar(double sp,int nu,int a)
	{
		super(sp,nu);
		airBaloonType=a;
	}
	 public void display()
	    {
	    	System.out.println("Speed is : "+speed);
	    	System.out.println("No of Gears : "+noOfGear);
	    	System.out.println("airBaloonType : "+airBaloonType);
	    }

}
