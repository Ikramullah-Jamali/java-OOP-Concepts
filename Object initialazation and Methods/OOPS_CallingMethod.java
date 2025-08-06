

class  OOPS_CallingMethod    /* call the methods */
{
	public void run()
	{
		System.out.println(" I am running ");
	}
	public void eat()
	{
		System.out.println(" I am eating.");
	}
	public static void main(String [] args)
	{
	 	OOPS_CallingMethod bozu=new OOPS_CallingMethod();
		System.out.println(" 1 ");
		bozu.run();
		bozu.eat();	
	}
}

