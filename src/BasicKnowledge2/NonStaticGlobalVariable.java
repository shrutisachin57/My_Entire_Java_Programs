package BasicKnowledge2;

public class NonStaticGlobalVariable {
	
	String name="Java";

	public static void main(String[] args) {
		NonStaticGlobalVariable g1=  new NonStaticGlobalVariable();
		g1.name="Python";
		System.out.println(g1.name);
	}

}
