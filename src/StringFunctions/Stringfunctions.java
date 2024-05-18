package StringFunctions;

public class Stringfunctions {

	public static void main(String[] args) {
		String name1="dayanand sagar institute of technology";
		String name2="SHRUTI";

		System.out.println(name1.length());
		System.out.println(name1.charAt(9));
		System.out.println(name1.toUpperCase());
		System.out.println(name2.toLowerCase());
		System.out.println(name1.indexOf('y'));
		System.out.println(name1.contains("sagari"));
		System.out.println(name2.concat(" is my name"));
		System.out.println(name1.trim());

	}

}
