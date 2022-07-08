package com.Assignment_8;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Item
{
	List<String> str;

	public Item(List<String> str) {
		
		this.str = str;
	}
	public void assending()
	{
		Collections.sort(str);
		System.out.println("Assending Order :");
		for(String s : str)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------");
	}
	
	public void dessending()
	{
		Collections.sort(str, Collections.reverseOrder());
		System.out.println("Desending Order :");
		for(String s : str)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------");
	}
	public void dubremove()
	{
		Set<String> ilist = str.stream().distinct().collect(Collectors.toSet());
		System.out.println("Duplicate Removed :");
		for(String s : ilist)
		{
			System.out.println(s);
		}
	}
}

