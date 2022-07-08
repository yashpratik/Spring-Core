package com.Assignment_6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestVowels 
{
	public static void main(String[] args) 
	{
		ApplicationContext objctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Vowel objv = (Vowel) objctx.getBean("vbean");
		objv.Novowel();
	}
}
