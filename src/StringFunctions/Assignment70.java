package StringFunctions;

public class Assignment70 {
	
	static int CountofDigit=0; 

	public static void main(String[] args) 
	{
	
		String s1="Manish1234";
		 
		char[] c1=s1.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isDigit(c1[i]);
				
			if(b1==true)
			{
			CountofDigit++;
			}}
			System.out.println("Count of digits is "+CountofDigit);
		}}
		
		
		

	


