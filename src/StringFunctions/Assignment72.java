package StringFunctions;

import java.util.Arrays;

public class Assignment72 
{
	static int countofalpha;
	public static void main(String[] args) {
		
		String s1="Shruti!#@";
		
		char[] c1=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		int l1=c1.length;
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			
			if(b1==true)
			{
				countofalpha++;
			}}
			System.out.println(l1-countofalpha);
			
	}}

	


