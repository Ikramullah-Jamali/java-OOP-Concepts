
interface Showable
{
	void show(); // abstract method
}

class AbstractionUsingInterface implements Showable
{
	public void show()
	{
		System.out.println("1");
	}
	public static void main(String [] args)
	{
		AbstractionUsingInterface i=new AbstractionUsingInterface();
		i.show();
	}
}
