package com.Assignment_7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testclass 
{
	public static void main(String[] args) 
	{
	ApplicationContext objct = new ClassPathXmlApplicationContext("applicationcontext.xml");
	
	class_1 objc = (class_1) objct.getBean("cls1");
	
	objc.mere_array();
	}
}
