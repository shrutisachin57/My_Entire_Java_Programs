package BasicKnowledge2;

public class Globalvariable3 {
	
	String name="java";
	int age =64;
	double weight=90.7;
	
	void add(String name,int age,double weight)
	{
		System.out.println("My bio is"+ name + age + weight);
	}

	public static void main(String[] args) {
		Globalvariable3 g1=new Globalvariable3();
		System.out.println(g1.name);
		System.out.println(g1.age);
		System.out.println(g1.weight);
		g1.add("shruti", 60, 72.8);
		}

}
