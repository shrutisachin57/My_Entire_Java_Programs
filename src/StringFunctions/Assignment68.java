package StringFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment68{

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		boolean b1[]=new boolean [2];
		
		for(int i=0;i<2;i++)
		{

			System.out.println("Enter the value at"+i);
			b1[i]=s1.nextBoolean();
			}
		
		boolean b2[]=new boolean[2];
		for(int i=1;i>=0;i--)
		{
			System.out.println("Enter the value at"+i);
			b2[i]=s1.nextBoolean();
			
			}
		
		System.out.println(Arrays.toString(b1));
		System.out.println(Arrays.toString(b2));
		
		System.out.println(Arrays.equals(b1, b2));
		
		
		
		

	}

}
