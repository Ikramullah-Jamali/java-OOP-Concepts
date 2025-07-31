

class TestWithParameter
{
	void showA(int a)
	{
		System.out.println("1");
	}
}
class OverridingWithParameters extends TestWithParameter
{
	void showA(int a)
	{
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		TestWithParameter t=new TestWithParameter();
		t.showA(10);
		OverridingWithParameters o=new OverridingWithParameters();
		o.showA(10);
	}
}
		
		