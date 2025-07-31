

class TestBasic
{
	void showA()
	{
		System.out.println("1");
	}
}
class OverridingBasicExample extends TestBasic
{
	void showA()
	{
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		TestBasic t=new TestBasic();
		t.showA();
		OverridingBasicExample o=new OverridingBasicExample();
		o.showA();
	}
}
		
		