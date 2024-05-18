package Assignments;

public class Assignment15 
{
	interface Interface1
	{
		void login();
		void logout();
	}
	
	interface Interface2 extends Interface1
	{
		void search();
		void filter();
	}
	
	class Child implements Interface2
	{
		 void add()
		{
			System.out.println("Addition");
		}

		@Override
		public void login() 
		{
			
		}
		public void logout() 
		{
			
		}
		public void search() 
		{
			
		}
		public void filter() 
		{
			
		}
	    }
       public static void main(String[] args) 
	{
		Child c1= new Child();
		c1.add();
	}}
		
		
		
	


