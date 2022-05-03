package com.automobile.FourWheeler;
import com.automobile.Vehicle;
public class Logan extends Vehicle {
	
	int speed;
	int gps;
	String regNo;
	String modelName;
	String owner;
	public Logan(int s,int g,String reg,String mn,String o)
	{
		speed=s;
		gps=g;
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
	public int speed()
	{
		return speed;
	}
	public int gps()
	{
		return gps;
	}
	

}
