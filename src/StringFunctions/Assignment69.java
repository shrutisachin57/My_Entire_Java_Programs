package StringFunctions;

import java.util.Arrays;



public class Assignment69 {
	
	static int countofAlpha=0;
	public static void main(String[] args) 
	{
		
		String s1="Manish";
		char[] c=s1.toCharArray();
		//System.out.println(Arrays.toString(c));
			for(int i=0;i<c.length;i++)
			{
				boolean answer=Character.isAlphabetic(c[i]);
				
				if(answer==true)
				{
				countofAlpha++;
				}}
				System.out.println(countofAlpha);
			}
			
		
	
		
		
		
		
		
	}


