package StringFunctions;

import java.util.Arrays;

public class Assignment71 
{
	
	static int Countofspace=0;

	public static void main(String[] args) 
	{
		String name="Shruti Yaligar";
		char[] c1= name.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isSpaceChar(c1[i]);
		if(b1==true)
		{
			Countofspace++;
		}}
		System.out.println(Countofspace);
		

	}

}
