package BasicKnowledge;

public class TypesOfMethods 
{
	public TypesOfMethods ()
	{
		System.out.println("Constructor");
	}
	
	static void add()
	{
		System.out.println("Static Method");
	}
	
	void subtraction()
	{
		System.out.println ("NonStatic Method");
	}

	public static void main(String[] args) {
		TypesOfMethods  c1=new TypesOfMethods ();
		c1.subtraction();
		add();
		

	}

}
