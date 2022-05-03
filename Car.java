
public class Car {
	double speed;
	int noOfGear;
	Car()
	{
		
	}
	Car(double s,int n)
	{
		speed=s;
		noOfGear=n;
	}
	public void drive(double s1,int n1)
	{
		speed=s1;
		noOfGear=n1;
	}
    public void display()
    {
    	System.out.println("Speed is : "+speed);
    	System.out.println("No of Gears : "+noOfGear);
    }
}
