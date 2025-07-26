

class GrandParent
{
	void showA()
	{
		System.out.println("GrandParent class method");
	}
}
class Parent extends GrandParent
{
	void showB()
	{
		System.out.println("Parent class method");
	}
}
class MultilevelInheritanceExample  extends Parent
{
	void showC()
	{
		System.out.println("MultilevelInheritanceSimulation class method");
	}
		
    public static void main(String[] args) 
	{
        MultilevelInheritanceExample child = new MultilevelInheritanceExample();
        child.showA(); // from GrandParent
        child.showB(); // from Parent
        child.showC(); // from This Class
    }
}