package com.Assignment_9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCity
{
	public static void main(String[] args) 
	{
		List<CityDis> clist = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		CityDis obj1 = (CityDis) objctx.getBean("cbean1");
		CityDis obj2 = (CityDis) objctx.getBean("cbean2");
		CityDis obj3 = (CityDis) objctx.getBean("cbean3");
		CityDis obj4 = (CityDis) objctx.getBean("cbean4");
		
		clist.add(obj1);
		clist.add(obj2);
		clist.add(obj3);
		clist.add(obj4);
		
		System.out.println("Enter fromCity Name :");
		String fromcity = sc.next();
		
		System.out.println("Enter to city name :");
		String tocity = sc.next();
		
		List<CityDis> matchlist = clist.stream().filter(c1->c1.getFromcity().equalsIgnoreCase(fromcity)).filter(c2->c2.getTocity().equalsIgnoreCase(tocity)).toList();
		
		  if (!matchlist.isEmpty()) {
	            for (CityDis cities : matchlist) {
	                System.out.print("distance between "+cities.getFromcity() +" & "+cities.getTocity()+" is "+cities.getDistance() + " Km");

	            }
	        } else
	            System.out.println("data not available");
	    }
	}

