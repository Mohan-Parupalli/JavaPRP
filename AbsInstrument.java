
public class AbsInstrument {

	public static void main(String[] args) {
		
//		Instrument i1=new Piano();
//		Instrument i2=new Flute();
//		Instrument i3=new Guitar();
//		i1.play();
//		i2.play();
//		i3.play();
		Instrument a[] =new Instrument[10];
		a[0]=new Piano();
		a[1]=new Flute();
		a[2]=new Guitar();
		a[4]=new Piano();
		a[3]=new Guitar();
		a[5]=new Flute();
		a[6]=new Piano();
		a[7]=new Piano();
		a[8]=new Guitar();
		a[9]=new Guitar();
		
//		for(int i=0;i<10;i++)
//		{
//			
//			if(a[i] instanceof Flute )
//			{
//				System.out.println("Flute is stored at "+i+" of Instrument array");
//			}
//			else if(a[i] instanceof Piano )
//			{
//				System.out.println("Piano is stored at "+i+" of Instrument array");
//			}
//			else if(a[i] instanceof Guitar)
//			{
//				System.out.println("Guitar is stored at "+i+" of Instrument array");
//			}
//			
//		}
		int j=0;
		for(Instrument i : a)
		{
			
			if(i instanceof Flute )
			{
				System.out.println("Flute is stored at "+j+" of Instrument array");
				j++;
			}
			else if(i instanceof Piano )
			{
				System.out.println("Piano is stored at "+j+" of Instrument array");
				j++;
			}
			else if(i instanceof Guitar)
			{
				System.out.println("Guitar is stored at "+j+" of Instrument array");
				j++;
			}
		}
		
		// TODO Auto-generated method stub

	}

}
