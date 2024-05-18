package BasicKnowledge;

public class LogicalOperators3 {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		if(!(a<=b||b>a))
		{
			System.out.println("OR with NOT operator");
		}
		
		if(!(a<b&&a==b))
		{
			System.out.println("AND with NOT operator");
		}

	}

}
