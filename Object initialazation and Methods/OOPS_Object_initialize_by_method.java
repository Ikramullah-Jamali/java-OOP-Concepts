

class OOPS_Object_initialize_by_method   /* initialize object by methods */
{
	String color;
	int age;
	public void initObj(String c,int a)
	{
		color=c;
	    age=a;
	}
	public void display()
	{
		System.out.println(color+"  "+age);
	}
	public static void main(String [] args)
	{ 
	    OOPS_Object_initialize_by_method  bozu=new OOPS_Object_initialize_by_method ();
		bozu.initObj("Red",20);
		bozu.display();
	}
	
}
		
		
		