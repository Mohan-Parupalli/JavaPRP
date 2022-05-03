package javaOOPS;

public class Video {
	String videoName;
	boolean checkOut;
	int rating;
	public Video()
	{
		
	}
	public Video(String name)
	{
		videoName=name;
	}
	public String getName()
	{
		return videoName;
	}
	public void doCheckout()
	{
		checkOut=true;
		System.out.println("Video "+videoName+" checked out successfully");
	}
	public void doReturn()
	{
		checkOut=false;
		System.out.println("Video "+videoName+" returned sucessfully");
		
	}
	public void receiveRating(int rating)
	{
		this.rating=rating;
		System.out.println("Rating \""+rating+"\" has been mapped to the video \""+videoName+"\"");
	}
	public int getRating()
	{
		return rating;
	}
	
	public boolean getCheckout()
	{
		return checkOut;
	}
	
	

}
