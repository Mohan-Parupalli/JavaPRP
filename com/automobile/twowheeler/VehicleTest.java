package com.automobile.twowheeler;
public class VehicleTest {

	public static void main(String[] args) {
		Hero h1=new Hero(60,"IN 2532","Ismart","Vinod");
		Honda h2=new Honda(70,"IN 2555","Unicorn","Viraj");
		System.out.println(h1.getSpeed());
		System.out.println(h1.getRegistrationNumber());
		System.out.println(h1.getModelName());
		System.out.println(h1.getOwnerName());
		h1.radio();
		System.out.println();
		System.out.println(h2.getSpeed());
		System.out.println(h2.getRegistrationNumber());
		System.out.println(h2.getModelName());
		System.out.println(h2.getOwnerName());
		h2.cdplayer();
		
		
		
		// TODO Auto-generated method stub

	}

}
