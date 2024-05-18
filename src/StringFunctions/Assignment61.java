package StringFunctions;
import java.util.Date;

public class Assignment61 {

	public static void main(String[] args) {
		
		{
			Date d1= new Date();
			System.out.println(d1.getTime());
			Date d2= new Date(d1.getTime()+(60*60*1000*24*4));
			Date d3= new Date(d1.getTime()-(60*60*1000*24*1));
			System.out.println(d2);  
			System.out.println(d3);
			String input=d1.toString();
			System.out.println(input);
			
			String month=input.substring(4,7);
			System.out.print(month);
			String date=input.substring(8,10);
			System.out.print(date);
			String year=input.substring(input.length()-4);
			System.out.println(year);
			System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
			System.out.println(date.concat("-").concat(month).concat("-").concat(year));
			System.out.println(date.concat("/").concat(month).concat("/").concat(year));
			
			
			
		}

	}

}


/*25 Apr 2024
25-Apr-2024
25/Apr/2024*/