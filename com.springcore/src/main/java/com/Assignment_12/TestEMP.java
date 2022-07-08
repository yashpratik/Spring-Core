package com.Assignment_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEMP 
{
	public static void main(String[] args) 
	{
		ApplicationContext objct = new ClassPathXmlApplicationContext("applicationcontext.xml");
		List<Employee> eplist = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		Employee objep = (Employee) objct.getBean("empbean");
		Employee objep1 = (Employee) objct.getBean("empbean1");
		Employee objep2 = (Employee) objct.getBean("empbean2");
		Employee objep3 = (Employee) objct.getBean("empbean3");
		
		eplist.add(objep);
		eplist.add(objep1);
		eplist.add(objep2);
		eplist.add(objep3);
		
		for(Employee e : eplist)
		{
			System.out.println(e.toString());
		}
		//a Print maximum salary in department
		System.out.println("Q1:-Enter Department Name :");
		String dep11 = sc.next();
		Employee emp = eplist.stream().filter(e->e.dept.dname.equals(dep11)).max((e1,e2)->e1.salary>e2.salary ?1:-1).get();
		System.out.println("Employee Number :"+emp.ename+"has" + "Maximum salary = "+emp.salary);
		
		//b Print name of employee having highest salary
		Employee maxsal = eplist.stream().max((e1,e2)->e1.salary>e2.salary ?1:-1).get();
		System.out.println("\nQ2:-Employee having highest salary\n ->"+maxsal.ename);
		
		// c. Print Name of employee having salary less than or equal to average salary.
		
		Double avgsalary = eplist.stream().collect(Collectors.averagingInt(e->e.salary));
		System.out.println("Average salary of Employees :"+avgsalary);
		List<Employee> elist = eplist.stream().filter((e1->e1.salary<=avgsalary)).toList();
		System.out.println("\n Q3:- Employee having less than and average salary :");
		for(Employee ee : elist)
		{
			System.out.println(ee.toString());
		}
		//Average Salary of each Department
		System.out.println(" \nQ4:-Average salary of each department");
		System.out.println("Enter department Name :");
		String dep1=sc.next();
		double avgsalary1 = eplist.stream().filter(e->e.dept.dname.equals(dep1)).collect(Collectors.averagingDouble(e->e.salary));
		
		System.out.println(avgsalary1);
	}
}
