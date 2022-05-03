package exceptionhandling;

public class UserRegistration {
	
	public void registerUser(String username,String userCountry) throws InvalidCountryException
	{
		if(userCountry.equalsIgnoreCase("India"))
		{
			System.out.println("User Registration Done Successfully");
		}
		else
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
	}

	public static void main(String[] args) {
		UserRegistration u=new UserRegistration();
		try
		{
		u.registerUser("Mini", "India");
		}
		catch(InvalidCountryException ie)
		{
			System.out.println(ie);
		}
		// TODO Auto-generated method stub

	}

}
