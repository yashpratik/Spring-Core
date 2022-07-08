package com.Assignment_6;

public class Vowel 
{
	String ar[] = new String[10];

	public Vowel(String[] ar) {
		
		this.ar = ar;
	}
	public void Novowel()
	{
		for(int i=0;i<ar.length;i++)
		{
			String s = ar[i];
			char ch[] = s.toCharArray();
			int count=0;
			
			for(int j=0;j<ch.length;j++)
			{
				if(ch[j]!='a' && ch[j]!='e' && ch[j]!='i' && ch[j]!='o' && ch[j]!='u' && ch[j]!='A' && ch[j]!='E' && ch[j]!='I' &&        ch[j]!='O' && ch[j]!='U')
				{
					count++;
				}
			}
			if(count==ch.length)
			{
				String s1 = new String(ch);
				System.out.println(s1);
			}
		}
	}
}
