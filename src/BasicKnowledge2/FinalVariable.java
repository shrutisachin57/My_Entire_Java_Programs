package BasicKnowledge2;

public class FinalVariable {
	
	final int a = 100;
	
	static void add()
	{
		final int b=100;
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		FinalVariable v1= new FinalVariable();
		System.out.println(v1.a);
		add();
		
		

	}

}
