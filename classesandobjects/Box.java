package classesandobjects;

public class Box {
	int width,height,depth;
	
	Box(int w,int h,int d)
	{
		width=w;
		height=h;
		depth=d;
	}
	int getVolume()
	{
		int vol=width*height*depth;
		return vol;
	}

	public static void main(String[] args) {
		
		Box b2=new Box(5,10,15);
		System.out.println("The volume of the box is : "+b2.getVolume());
		
		// TODO Auto-generated method stub

	}

}
