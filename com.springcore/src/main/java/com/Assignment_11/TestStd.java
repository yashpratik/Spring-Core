package com.Assignment_11;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStd 
{
	public static void main(String[] args) 
	{
		List<Student> slist = new ArrayList<Student>();
		
		ApplicationContext objct = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student objst = (Student) objct.getBean("stbean");
		Student objst1 = (Student) objct.getBean("stbean1");
		
		slist.add(objst);
		slist.add(objst1);
		
		for(Student s : slist)
		{
			System.out.println(s.sname+" "+s.res.total_marks);
		}
		
		List<Student> sortstd = slist.stream().sorted((s1,s2)->Double.compare(s1.res.total_marks, s2.res.total_marks)).toList();
		System.out.println("\nSorted list as per total marks obtained by each student ");
		for(Student ss : sortstd)
		{
			System.out.println(ss.sname+" "+ss.res.total_marks);
		}
	}
}
