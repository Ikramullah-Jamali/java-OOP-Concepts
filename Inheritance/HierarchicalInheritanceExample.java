

class  Base
{
	void showA()
	{
		System.out.println("Parent class method");
	}
}
class ChildOne extends  Base
{
	void showB()
	{
		System.out.println("ChildOne class method");
	}
}
class HierarchicalInheritanceExample extends  Base
{
	void showC()
	{
		System.out.println("Main class method");
	}
	public static void main(String []args)
	{
		HierarchicalInheritanceExample ob1=new  HierarchicalInheritanceExample();
		ob1.showA();
        ob1.showC();
		System.out.println("-----------------------");
		ChildOne ob2=new ChildOne();
		ob2.showA();
		ob2.showB();
		System.out.println("-----------------------");
		Base ob3=new Base();
		ob3.showA();
		 
	}
}
