package com.Assignment_7;


public class class_1 
{
	int a[] = new int[5];
	class_2 obj;
	public class_1(int[] a, class_2 obj) {
		super();
		this.a = a;
		this.obj = obj;
	}
	public void mere_array()
	{
		int c[] = new int[a.length + obj.b.length];
		int index=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[index++]=a[i];
			if(i<obj.b.length)
				c[index++]=obj.b[i];
		}
			int max=Integer.MIN_VALUE;
			for(int i=0;i<c.length;i++)
			{
				if(max<c[i])
					max=c[i];
			}
			System.out.println("The Maximum no is :"+max);
	}
	
}
