package BasicKnowledge;

public class NonStaticMethod 
{
	int add()
	{
		int a=100;
		int b=200;
		int sum=a+b;
		System.out.println(sum);
		return sum;
	}
	int sub()
	{
		int a=200;
		int b=100;
		int sub=a-b;
		System.out.println(sub);
		return sub;
	}
    public static void main(String[] args) {
		NonStaticMethod N1= new NonStaticMethod();
		N1.add();
		N1.sub();
}
}
