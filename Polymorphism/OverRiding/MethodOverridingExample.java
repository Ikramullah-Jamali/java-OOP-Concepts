

class Test 
{
	void showA()
	{
		System.out.println("1");
		//return null;
	}
}
class MethodOverridingExample extends Test
{
	void showA()
	{
		System.out.println("2");
		//return null;
	}
	public static void main(String [] args)
	{
		Test t=new Test();
		t.showA();
		MethodOverridingExample o=new MethodOverridingExample();
		o.showA();
	}
}
