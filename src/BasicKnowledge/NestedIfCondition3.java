package BasicKnowledge;

public class NestedIfCondition3 
{

	public static void main(String[] args) 
{
		int a=100;
		int b=300;
      
      if(a<b)
      {
    	  if(a!=b)
    	  {
    		  System.out.println("1");
    	  }
    	  else if(a<=b)
    	  {
    		  System.out.println("2");
    	  }
    	  else
    	  {
    		  System.out.println("3");
    	  }
      }
      else
      {
    	  System.out.println("4");
      }
      }
}
