package BasicKnowledge;

public class ConstructorOverloading 
{
	ConstructorOverloading()
	{
		System.out.println("I am a constructor");
	}
	ConstructorOverloading(int a)
	{
		System.out.println("1");
	}
	ConstructorOverloading(String b)
	{
		System.out.println("2");
	}
	ConstructorOverloading(char c)
	{
		System.out.println("3");
	}
	ConstructorOverloading(double t, boolean r, char g,float f, String s, int j, int y)
	{
		System.out.println("4");
	}
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(1);
		new ConstructorOverloading("Shruti");
		new ConstructorOverloading('C');
		new ConstructorOverloading(0.09, true, 'c',0.9f,"shruti", 120,100);
		}
}
