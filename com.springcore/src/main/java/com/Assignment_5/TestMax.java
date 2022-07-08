package com.Assignment_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMax 
{
	public static void main(String[] args) 
	{
		ApplicationContext objct = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		MaxNo objn = (MaxNo) objct.getBean("mbean");
		
		objn.max();
	}
}
