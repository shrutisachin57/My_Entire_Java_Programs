package StringFunctions;

import java.util.Arrays;

public class Assignment80 {

	public static void main(String[] args) {
	
		String name[]=new String[4];
		name[0]="shruti";
		name[1]="soumya";
		name[2]="shilpa";
		name[3]="manushi";
		String namecopy[]=new String[name.length];
		
		for(int i=name.length-1;i>=0;i--)
		{
			
			
			namecopy[i]=name[4-i-1];
	
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));

	}

}
