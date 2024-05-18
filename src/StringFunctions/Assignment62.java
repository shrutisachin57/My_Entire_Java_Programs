package StringFunctions;

public class Assignment62 {

	public static void main(String[] args) 
	{
		
		String names[]=new String[2];
		names[0]="Shruti";
		names[1]="Sachin";
		
		int roll_number[]=new int[2];
		roll_number[0]=10;
		roll_number[1]=11;
		
		char gender []=new char[2];
		gender[0]='f';
		gender[1]='m';
		
		System.out.println("Student name"+ " "+ "Roll number"+ " "+ "Gender");
		
		for(int i=0;i<+2;i++)
		{
			System.out.println(names[i]+"        "+roll_number[i]+"         "+gender[i]);
		}
		
		

	}

}
