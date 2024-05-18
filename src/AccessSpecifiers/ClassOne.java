package AccessSpecifiers;

public class ClassOne 
{
	public static void add()
	{
		System.out.println("Addition");
	}
	private void mul()
	{
		System.out.println("Multiplication");
	}
	protected void div()
	{
		System.out.println("Division");
	}
	static void mod()
	{
		System.out.println("Modulus");
	}

	public static void main(String[] args) {
		ClassOne c1=new ClassOne();
		c1.mul();
		c1.div();
		add();
		mod();


	}

}
