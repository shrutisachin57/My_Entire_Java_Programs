package StringFunctions;

public class Assignment73 {

	public static void main(String[] args) {
	
		String s1="suman";
		String reverse="";
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c=s1.charAt(i);
			reverse=reverse+c;
		}
		System.out.println(reverse);
		if(s1.equals(reverse))
				{
			System.out.println("Given text is palindrome");
		}else {
			System.out.println("Given text is not palindrome");
		}
			

	}

}
