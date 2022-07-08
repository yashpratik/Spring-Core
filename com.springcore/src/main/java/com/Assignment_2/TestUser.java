package com.Assignment_2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser 
{
	public static void main(String[] args) 
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		User obju = (User) objctx.getBean("utest");
		obju.getavg();
	}
}
