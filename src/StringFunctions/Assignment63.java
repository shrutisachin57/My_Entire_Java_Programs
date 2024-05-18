package StringFunctions;

import java.util.Scanner;

public class Assignment63 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int roll_number[]=new int[3];
		
		for(int i=0;i<3;i++)	
		{
			System.out.println("Enter the roll num at array" +i);
			roll_number[i]= sc.nextInt();
			System.out.println(roll_number[i]);
		}
		        
		
	}

}
