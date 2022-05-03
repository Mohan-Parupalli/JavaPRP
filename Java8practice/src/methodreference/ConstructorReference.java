package methodreference;

interface PrimeCheckInterface
{
	void isPrime(int p);
}
public class ConstructorReference {

	ConstructorReference(int n)
	{
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0)
			{
				flag = 1;
			}
		}
		if(flag == 0)
		{
			System.out.println("Prime");
		}
		else
			System.out.println("Not Prime");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeCheckInterface pi = ConstructorReference :: new;
		pi.isPrime(113);

	}

}
