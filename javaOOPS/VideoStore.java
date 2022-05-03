package javaOOPS;

public class VideoStore {

	Video store[];
	int count;
	
	
	public VideoStore()
	{
		store = new Video[1000];
		count = 0;
	}
	
	
	public void addVideo(String name)
	{
		store[count++]=new Video(name);
		//count++;
		System.out.println("Video " + name + " added successfully");
	}
	
	
	public void doCheckout(String name)
	{
		int index=this.indexFind(name);
		if(index != -1)
		  store[index].doCheckout();
		else
		  System.out.println("Video "+name+" not found");
	}
	
	
	public int indexFind(String name)
	{
		for(int i=0;i<count;i++)
		    if((store[i].getName()).equalsIgnoreCase(name))
			  return i;			
		return -1;
	}
	
	
	public void doReturn(String name)
	{
		int index=this.indexFind(name);
		if(index != -1)
			store[index].doReturn();
		else
			System.out.println("Video "+name+" Not Found");
	}
	
	
	public void receiveRating(String name,int rating)
	{
		int index=this.indexFind(name);
		if(index != -1)
			store[index].receiveRating(rating);
		else
			System.out.println("Video "+name+" Not Found");
	}
	
	
	public void listInventory()
	{
		System.out.println("----------------------------------------------------------------");
		System.out.printf("%-20s|%7s%-20s|%7s%-20s%n", "Video Name", " ", "Checkout Status", " ", "Rating");
		for(int i=0;i<count;i++)
		  System.out.printf("%-20s|%7s%-20s|%7s%-20s%n", store[i].getName(), " ",store[i].getCheckout(), " ", store[i].getRating());
		System.out.println("----------------------------------------------------------------");
	}
}
