package BasicKnowledge;

public class ArithmaticOperationsUsingStaticMethods 
{
	static void addition()
	{
	int a=10;
	int b=20;
	int sum=a+b;
	System.out.println(sum);
	}
	static void subtraction()
	{
	int a=20;
	int b=10;
	int sub=a-b;
	System.out.println(sub);
	}
	static void multiplication()
	{
	int a=10;
	int b=20;
	int mul=a*b;
	System.out.println(mul);
	}
	static void division()
	{
	int a=50;
	int b=100;
	int div=a/b;
	System.out.println(div);
	}
	static void modulus()
	{
	int a=10;
	int b=3;
	int mod=a%b;
	System.out.println(mod);
	}

	public static void main(String[] args) {
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
			
	}

}
