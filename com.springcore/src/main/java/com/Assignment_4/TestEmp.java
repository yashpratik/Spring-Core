package com.Assignment_4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmp 
{
	public static void main(String[] args) 
	{
	ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	List<Employee> elist = new ArrayList<Employee>();
	
	Employee obje = (Employee) objctx.getBean("ebean1");
	Employee obje1 = (Employee) objctx.getBean("ebean2");
	
	elist.add(obje);
	elist.add(obje1);
	
	List<Employee> sortlist = elist.stream().sorted((e1,e2)->Double.compare(e1.salary, e2.salary)).toList();
	
	for(Employee e : sortlist)
	{
		e.show();
	}
	}
}
