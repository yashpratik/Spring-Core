package com.Assignment_8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestItem
{
	public static void main(String[] args) 
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Item obji = (Item) objctx.getBean("ibean");
		
		obji.assending();
		obji.dessending();
		obji.dubremove();
	}
}
