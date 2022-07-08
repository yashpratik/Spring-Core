package com.Assignment_2;

import javax.annotation.PostConstruct;

public class User
{
	int a[]= new int[6];

	public User(int[] a) {
		
		this.a = a;
	}
	private double getUser()
	{
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			count++;
		}
		double avr=sum/a.length;
		return avr;
	}
	public void getavg()
	{
		System.out.println(getUser());
	}
}
