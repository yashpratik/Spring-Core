package com.Assignment_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRole
{
	public static void main(String[] args) 
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Role objr = (Role) objctx.getBean("rbean");
	}
}
