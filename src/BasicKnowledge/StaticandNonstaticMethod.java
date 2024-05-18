package BasicKnowledge;

public class StaticandNonstaticMethod {
	
	static void Add()
	{
	int a=100;
	int b=200;
	int sum=a+b;
	System.out.println(sum);
	}
	 void Multiplication()
	{
	int a=100;
	int b=200;
	int mul=a*b;
	System.out.println(mul);
	}

	public static void main(String[] args) {
		Add();
		StaticandNonstaticMethod s1=new StaticandNonstaticMethod();
		s1.Multiplication();
	}
}
