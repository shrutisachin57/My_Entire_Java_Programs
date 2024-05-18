package StringFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment67 {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		int roll_num1[]=new int [3];
		
		for(int i=0;i<3;i++)
		{

			System.out.println("Enter the value at"+i);
			roll_num1[i]=s1.nextInt();
			}
		
		int roll_num[]=new int[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the value at"+i);
			roll_num[i]=s1.nextInt();
			
			}
		
		System.out.println(Arrays.toString(roll_num1));
		System.out.println(Arrays.toString(roll_num));
		
		System.out.println(Arrays.equals(roll_num1, roll_num));
		
		
		
		

	}

}
