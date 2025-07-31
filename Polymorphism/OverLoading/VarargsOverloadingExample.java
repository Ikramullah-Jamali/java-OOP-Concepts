

class VarargsOverloadingExample  /*  varargs Method */
{
	void shaw(int a)
	{
		System.out.println("int method");
	}
	void show(int... a)
	{
		System.out.println("varargs method");
	}
	public static void main(String [] args)
	{
		VarargsOverloadingExample t=new VarargsOverloadingExample();
		t.show(10,20,30,40);
	}
}