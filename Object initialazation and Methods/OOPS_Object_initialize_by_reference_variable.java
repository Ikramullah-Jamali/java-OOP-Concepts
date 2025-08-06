

class OOPS_Object_initialize_by_reference_variable  /* initialize object by refrence variable */
{
	String color;
	int age;
	public static void main(String [] args)
	{
		OOPS_Object_initialize_by_reference_variable bozu=new OOPS_Object_initialize_by_reference_variable();
		bozu.color="Black";
		bozu.age=10;
		System.out.println(bozu.color+"  "+bozu.age);
	}
}