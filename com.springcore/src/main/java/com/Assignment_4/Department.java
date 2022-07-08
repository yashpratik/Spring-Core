package com.Assignment_4;

public class Department 
{
	int id;
	String dname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	public void dep()
	{
		System.out.println("Department id :"+id);
		System.out.println("Department Name :"+dname);
	}
}
