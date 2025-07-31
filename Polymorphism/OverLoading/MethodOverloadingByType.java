

class MethodOverloadingByType
{
	void show(int a)
	{
		System.out.println("1");
	}
	void show(String a)
	{
		System.out.println("2");
	}
	public static void main(String [] args)
	{
		MethodOverloadingByType t=new MethodOverloadingByType();
		t.show("abc");
	}
}
