

class TestAccess
{
	 protected void show()
	{
		System.out.println("1");
	}
}
class OverridingAccessModifier extends TestAccess
{
	 public void show()
	{
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		TestAccess t=new TestAccess();
		t.show();
		OverridingAccessModifier o=new OverridingAccessModifier();
		o.show();
	}
}