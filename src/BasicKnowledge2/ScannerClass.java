package BasicKnowledge2;

import java.util.Scanner;
public class ScannerClass {
public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the int number");
		int num=s1.nextInt();
		System.out.println(num);
		
		System.out.println("Enter the double number");
		double num1=s1.nextDouble();
		System.out.println(num1);
		
		System.out.println("Enter the float number");
		float num2=s1.nextFloat();
		System.out.println(num2);
		
		System.out.println("Enter the long number");
		long l1=s1.nextLong();
		System.out.println(l1);
		
		System.out.println("Enter the num");
		byte b1=s1.nextByte();
		System.out.println(b1);
		
		System.out.println("Enter the string");
		String  s=s1.next();
		System.out.println(s);
		
		System.out.println("Enter true or false");
		boolean b2=s1.nextBoolean();
		System.out.println(b2);
		s1.close();

	}

}
