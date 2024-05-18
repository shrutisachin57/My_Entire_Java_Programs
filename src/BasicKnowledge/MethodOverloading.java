package BasicKnowledge;

public class MethodOverloading {
	void add()
	{
		int a=100;
		System.out.println(a+6);
	}
	
	 void add(int a)
	{
		System.out.println(a+6);
	}
	 static void add(double d, int b)
	 {
	 System.out.println(d+6);
	 }
	 
	 void add(int o, double s)
	 {
		 System.out.println(o-s);
	 }

	public static void main(String[] args)
	{
		MethodOverloading m1=new MethodOverloading();
		m1.add();
		m1.add(10);
		m1.add(10,0.9);
		add(10.5,10);
		
		
		 

	}

}
