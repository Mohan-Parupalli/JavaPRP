import java.util.*;


public class Lambda1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<25;i++)
		{
			int a=(int)(Math.random()*100);
			al.add(a);
		}
		
		al.forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		al.forEach(
			n->
			{
				if(n > 1)
				{	
				boolean isPrime=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i == 0)
				{
					isPrime=false;
					break;
				}
			}
			 
		if(isPrime)
		{
			System.out.print(n+" ");
		
		}
				
			}
			}
				);
			
		
		// TODO Auto-generated method stub

	}

}
