package com.automobile.twowheeler;
import com.automobile.Vehicle;
public class Hero extends Vehicle{
	int speed;
	String regNo;
	String modelName;
	String owner;
	public Hero(int s,String reg,String mn,String o)
	{
		speed=s;
		regNo=reg;
		modelName=mn;
		owner=o;
	}
	public String getModelName()
	{
		return modelName;
	}
	public String getRegistrationNumber()
	{
		return regNo;
	}
	public String getOwnerName()
	{
		return owner;
	}
	public int getSpeed()
	{
		return speed;
	}
	public void radio()
	{
	   System.out.println("Radio is Turned on");
	}
	
	

}
