package StringFunctions;

public class Assignment74 {
	static int countofinputnum=0;

	public static void main(String[] args) 
	{
		int num[]=new int[3];
		num[0]=67;
		num[1]=41;
		num[2]=41;
		int input=41;
		
		for(int i=0;i<num.length;i++)
		{
			
			if(input==num[i])
			{
				countofinputnum++;
				System.out.println(countofinputnum);
			}
		}
				
		
	}
}


