package classesandobjects;
import java.lang.Math;
public class Claculator {
	
    public static double powetInt(int num1,int num2)
    {
    	return (Math.pow(num1, num2));
    }
    public static double powerInt(double num1,int num2)
    {
    	return (Math.pow(num1, num2));
     }
    
    
    public static void main(String[] args) {
    	double power1=powerInt(2,5);
        double power2=powerInt(2.2,5);
        System.out.println(power1);
        System.out.println(power2);
		
		// TODO Auto-generated method stub

	}

}
