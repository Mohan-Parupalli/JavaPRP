
public class CashPayment extends Payment {
	CashPayment()
	{
		
	}
	CashPayment(double a1 )
	{
		super(a1);
	}
	 public void paymentDetails()
     {
    	 System.out.println("The Amount paid in Cash is : "+amount);
     }

}
