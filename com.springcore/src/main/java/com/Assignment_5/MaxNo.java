package com.Assignment_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxNo 
{
	List<Integer> num;

	public MaxNo(List<Integer> num) {
		super();
		this.num = num;
	}
	 void max()
	{
		Integer n = num.stream().max((m1,m2)->m1>m2?1:-1).get();
		System.out.println(n);
	}
}
