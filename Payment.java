
public class Payment {
	                 
                     double amount;
                     Payment()
                     {
                    	 
                     }
                     Payment(double a)
                     {
                    	 amount=a;
                     }

					public double getAmount() {
						return amount;
					}

					public void setAmount(double amount) {
						this.amount = amount;
					}
                    public void paymentDetails()
                     {
                    	 System.out.println("The Amount paid is : "+amount);
                     }
}
