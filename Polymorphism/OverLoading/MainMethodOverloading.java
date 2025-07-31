

class MainMethodOverloading  /* OverLoading of main() Method */
{
	public static void main(String [] args)
	{
		System.out.println("1");
		MainMethodOverloading t=new MainMethodOverloading();
		t.main(20);
	}
	 public static void main(int a)
	{
		System.out.println("2");
	}
}
