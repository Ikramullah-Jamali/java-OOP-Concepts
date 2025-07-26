
interface Showable  /* multiple inheritance */
{
	void show();
}
interface Displayable
{
	void display();
}
class AbstractionWithMultipleInterfaces implements Showable,Displayable
{
	public void show()
	{
		System.out.println("1");
	}
	public void display()
	{
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		AbstractionWithMultipleInterfaces i=new AbstractionWithMultipleInterfaces();
		i.show();
		i.display();
	}
}