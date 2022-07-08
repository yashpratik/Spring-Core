package com.Assignment_11;

public class Result 
{
	int math;
	int hindi;
	int english;
	int science;
	int total_marks;
	public Result(int math, int hindi, int english, int science) {
		super();
		this.math = math;
		this.hindi = hindi;
		this.english = english;
		this.science = science;
		this.total_marks = math + hindi + english + science;
	}
}
