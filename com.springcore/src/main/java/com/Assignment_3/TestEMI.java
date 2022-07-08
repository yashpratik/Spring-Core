package com.Assignment_3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEMI 
{
	public static void main(String[] args) 
	{
		ApplicationContext objac = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		EMI obje = (EMI) objac.getBean("ebean");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your loan amount");
		obje.setAmount(sc.nextInt());
		System.out.println("Enter your years");
		obje.setYear(sc.nextInt());
		obje.interrest();
	}
}
