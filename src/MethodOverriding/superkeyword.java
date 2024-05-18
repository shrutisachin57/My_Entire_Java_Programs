package MethodOverriding;

 class superkeyword {
	void login()
	{
		System.out.println("login with mobile");
	}
}
class Example extends superkeyword
{
	void login()
	{
		super.login();
		System.out.println("login with Email");
	}

	public static void main(String[] args) 
	{
		Example e2= new Example();
		e2.login();
		e2.login();
		
	}

}


