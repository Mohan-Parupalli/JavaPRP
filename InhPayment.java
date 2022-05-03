
public class InhPayment {

	public static void main(String[] args) {
		//CashPayment c=new CashPayment();
		CashPayment c1=new CashPayment(50000.25);
		c1.paymentDetails();
		CashPayment c2=new CashPayment(200000.76);
		c2.paymentDetails();
		//CreditCardPayment cc=new CreditCardPayment();
		CreditCardPayment cc1=new CreditCardPayment(600000.89,"Viraj Anand",24,1234);
	    cc1.paymentDetails();
		CreditCardPayment cc2=new CreditCardPayment(200000.55,"Abhijeeth Bhargav",29,5678);
		cc2.paymentDetails();
		// TODO Auto-generated method stub

	}

}
