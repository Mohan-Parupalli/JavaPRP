package methodreference;

interface FactInterface {
	int factInter(int f);
}

public class FactClass {
	
	public int factClass(int f)
	{
		int fact=1;
		for(int i=f;i>0;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactClass fc=new FactClass();
		FactInterface fi= fc::factClass;
        System.out.println(fi.factInter(5));
	}

}
