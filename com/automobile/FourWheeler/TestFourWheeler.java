package com.automobile.FourWheeler;

public class TestFourWheeler {

	public static void main(String[] args) {
		Logan l=new Logan(60,65,"IN 2532","Ismart","Vinod");
		Ford f=new Ford(70,"IN 2555","Unicorn","Viraj",32);
		System.out.println(l.speed());
		System.out.println("The Location status is "+ l.gps()+"degrees");
		System.out.println(l.getRegistrationNumber());
		System.out.println(l.getModelName());
		System.out.println(l.getOwnerName());
		System.out.println();
		System.out.println(f.speed());
		System.out.println(f.getRegistrationNumber());
		System.out.println(f.getModelName());
		System.out.println(f.getOwnerName());
		System.out.println("Temperature is : "+f.tempControl()+" degrees");
		// TODO Auto-generated method stub

	}

}
