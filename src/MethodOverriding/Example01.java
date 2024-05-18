package MethodOverriding;

 class Example01 
{
	void login()
	{
		System.out.println("login with mobile");
	}
}
class Example02 extends Example01
{
	void login()
	{
		System.out.println("login with Email");
	}

	public static void main(String[] args) 
	{
		Example02 e2= new Example02();
		e2.login();
		e2.login();
		
	}

}
