package BasicKnowledge;

public class LocalVariable {
	
	static void add()
	{
		int a;// Scope of local variable will be only inside the method
		a=10;//Local variable	 has to be intialized before utilizing
		System.out.println(a);
	}
	public static void main(String[] args) {
	int a=20; //Local variable
	System.out.println(a);
	add();
	

	}

}
