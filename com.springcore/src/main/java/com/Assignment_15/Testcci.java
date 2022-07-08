package com.Assignment_15;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcci {
public static void main(String[] args) 
{       
    List<Customer>slist =new ArrayList<Customer>();
    ApplicationContext obj = new ClassPathXmlApplicationContext("applicationcontext.xml");
    Customer c=(Customer) obj.getBean("cubean");
    c.display();
}
}
