package BasicKnowledge;
public class ArithmaticOperationsUsingNonStaticMethods {
	 void addition()
	{
    int a=100;
    int b=300;
    int sum=a+b;
    System.out.println(sum);
	}
	 void subtraction()
	{
    int a=400;
    int b=300;
    int sub=a-b;
    System.out.println(sub);
	}
	 void multiplication()
	{
    int a=100;
    int b=6;
    int mul=a*b;
    System.out.println(mul);
	}
	 void division()
	{
    int a=600;
    int b=300;
    int div=a/b;
    System.out.println(div);
	}
	 void modulus()
	{
    int a=600;
    int b=300;
    int mod=a%b;
    System.out.println(mod);
	}
	public static void main(String[] args) 
	{
		ArithmaticOperationsUsingNonStaticMethods m1=new ArithmaticOperationsUsingNonStaticMethods();
		m1.addition();
		m1.subtraction();
		m1.multiplication();
		m1.division();
		m1.modulus();

	}

}
