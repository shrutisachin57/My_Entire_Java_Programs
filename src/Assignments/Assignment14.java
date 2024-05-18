package Assignments;
public class Assignment14 
{
	static void Concrete_method1()
	{System.out.println("Static concrete method");}
	static void Concrete_method2()
	 {System.out.println("Non static concrete method");}
	 
abstract class Assignment extends Assignment14
{
	abstract void div();
	
	abstract void mod();
	 
	void login()
	 {
		 System.out.println("Non static concrete method");
		 }
	 void logout()
	 {
		 System.out.println("Non static concrete method");
		 }
	 }
  public  class Child extends Assignment
{
	   void search()
		 {
	System.out.println("cm1");
	}
	   void filter()
		 {
				System.out.println("cm2");
				}
	   public static void main(String[]args)
	   {
		   Concrete_method1();
		   Concrete_method1();
		   }
		
      void div() 
      {
    	  System.out.println("Abstract class implementation");}
	  void mod() 
	{
		System.out.println("Abstract class implementation");}}}
