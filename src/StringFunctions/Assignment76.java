package StringFunctions;

import java.util.Arrays;

public class Assignment76 {

	public static void main(String[] args) {
	
		String name[]=new String[4];
		name[0]="shruti";
		name[1]="soumya";
		name[2]="shilpa";
		name[3]="manushi";
		String namecopy[]=new String[name.length];
		
		for(int i=0;i<name.length;i++)
		{
			namecopy[i]=name[i];
		}
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(namecopy));

	}

}
