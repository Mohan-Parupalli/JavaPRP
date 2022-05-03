
public class CreditCardPayment extends Payment {
	String nameOnCard;
	int expDate;
	int cardNum;
	public CreditCardPayment() {
		
	      }
	public CreditCardPayment(double amo,String name,int exp,int num )
	{
		super(amo);
		nameOnCard = name;
		expDate = exp;
		cardNum = num;
		
	}
	 public void paymentDetails()
     {
		 System.out.println("The name on the Credit card is : "+nameOnCard);
		 System.out.println("Expiry date : "+expDate);
		 System.out.println("Card Number : "+cardNum);
    	 System.out.println("The Amount paid through card is : "+amount);
     }

}
