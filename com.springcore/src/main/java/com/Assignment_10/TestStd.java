package com.Assignment_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStd
{
	public static void main(String[] args) 
	{
		ApplicationContext objct = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student objs = (Student) objct.getBean("sbean");
		
		objs.getStd();
	}
}
