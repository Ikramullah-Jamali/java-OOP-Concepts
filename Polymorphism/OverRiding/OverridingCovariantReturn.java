

class TestCovariant
{
	Object show()
	{
		System.out.println("1");
		return null;
	}
}
class OverridingCovariantReturn extends TestCovariant
{
	String show()
	{
		System.out.println("2");
		return null;
	}
	public static void main(String [] args)
	{
		TestCovariant t=new TestCovariant();
		t.show();
		OverridingCovariantReturn o=new OverridingCovariantReturn();
		o.show();
	}
}