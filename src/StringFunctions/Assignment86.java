package StringFunctions;

public class Assignment86 {
	static int sum=0;
    static double avg=0;
    static int remainder;

	public static void main(String[] args) {
		
		int array[]=new int[4];	
		array[0]=10;
		array[1]=10;
		array[2]=10;
		array[3]=10;
		
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
			avg=sum/array.length;
			remainder=sum%array.length;
			
		}
		System.out.println("avg is " +avg);
		System.out.println("remainder is " +remainder);

	}

}
