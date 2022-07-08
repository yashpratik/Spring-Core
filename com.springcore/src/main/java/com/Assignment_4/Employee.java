package com.Assignment_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee 
{
	int eid;
	String ename;
	double salary;
	
	@Autowired
	@Qualifier("dbean1")
	Department dept;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	public void show()
	{
		System.out.println("Employee id :"+eid);
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Salary :"+salary);
		dept.dep();
	}
}
