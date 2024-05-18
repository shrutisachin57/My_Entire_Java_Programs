package Interface;

interface Teacher
{
	void login();
}

public abstract class demo1 implements Teacher 
{
	abstract void logout();

static void div()
{
	System.out.println("div");
}
	

	public static void main(String[] args) 
	{
		demo1 d1=new demo1();
		d1.login();		

	}


	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}


	@Override
	void log_out() {
		// TODO Auto-generated method stub
		
	}

}
