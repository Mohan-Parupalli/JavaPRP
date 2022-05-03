package methodreference;

interface DigitInterface
{
   int digiInterface(int x);
}
public class DigitCount {
	public static int digitCount(int n)
	{
		String s=Integer.toString(n);
		//char arr[]=s.toCharArray();
		int len=s.length();
		return len;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitInterface dInter= DigitCount :: digitCount;
		System.out.println(dInter.digiInterface(123456789));

	}

}
