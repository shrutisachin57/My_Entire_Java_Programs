package StringFunctions;

import java.util.Arrays;

public class Assignment75 {
public static void main(String[] args) {
		String s1="bread";
		String s2="beard";
		if(s1.length()!=s2.length())
		{
			System.out.println("Given string are not anagram of each other");
		}
		else
		{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        
        if(Arrays.equals(c1, c2)==true)
        {
			System.out.println("Given string are anagram of each other");

        }
        else
        {
			System.out.println("Given string are not anagram of each other");

        

	}}

}
}
