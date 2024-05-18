package BasicKnowledge2;

  class StudentClass
  {
	
	  StudentClass(int a)
		{
			System.out.println("Student constructor");
		}
	}
	
   public class invokingConstructor
	{
	   invokingConstructor()
		{
			System.out.println("invokingConstructor");
		}
	

	public static void main(String[] args) 
	{
		
		new StudentClass(60);
		
		}

}
