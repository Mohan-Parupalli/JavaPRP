package abstractclass;
import java.util.Random;
public class TestCompartment {

	public static void main(String[] args) {
		Compartment c[]=new Compartment[10];
		Random random=new Random();
		for(int i=0;i<10;i++)
		{
			
			int x=random.nextInt(5);
			if(x == 1)
			{
				c[i]=new FirstClass();
			}
			else if(x ==2)
			{
				c[i]=new General();
			}
			else if(x == 3)
			{
				c[i]=new Ladies();
				
			}
			else if(x == 4)
			{
				c[i]=new Luggage();
				
			}
			else
			{
				i--;
			}
		}
		for(Compartment i: c)
		{
			System.out.println("This is "+i.notice());
		}
		// TODO Auto-generated method stub

	}

}
