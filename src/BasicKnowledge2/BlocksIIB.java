package BasicKnowledge2;

public class BlocksIIB {
	static 
	{
		System.out.println("SIB1");
	}
	static
	{
		System.out.println("SIB2");
	}
	
	{
		System.out.println("IIB1");
	}
	
	{
		System.out.println("IIB2");
	}
	BlocksIIB()
	{
		System.out.println("I am a constructor");
	}
	public static void main(String[] args) 
	{
		
			System.out.println("Main method");
			BlocksIIB obj= new BlocksIIB();
	}

}
