package com.automobile.FourWheeler;

public class Ford {
	int speed;
	int gps;
	String regNo;
	String modelName;
	String owner;
	int temp;
	public Ford(int s,String reg,String mn,String o,int t)
	{
		speed=s;
		regNo=reg;
		modelName=mn;
		owner=o;
        temp=t;
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
	public int tempControl()
	{
		return temp;
	}

}
