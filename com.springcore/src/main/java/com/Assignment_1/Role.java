package com.Assignment_1;

public class Role 
{
	private  void Role()
	{
		
	}
	public static Role getRole()
	{
		System.out.println("Factoy methiod call");
		return new Role();
	}
}

