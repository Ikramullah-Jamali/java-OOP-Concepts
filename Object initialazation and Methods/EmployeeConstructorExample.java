

class EmployeeConstructorExample
{
	String name;
	int emp_id;
	
	EmployeeConstructorExample(String name,int emp_id)
	{
		this.name=name;
		this.emp_id=emp_id;
	}
	public static void main(String [] args)
	{
		EmployeeConstructorExample e1=new EmployeeConstructorExample("Hamid",101);
		EmployeeConstructorExample e2=new EmployeeConstructorExample("abc",102);
		System.out.println("Employee 1: "+e1.name+"   "+e1.emp_id);
	    System.out.println("Employee 2: "+e2.name+"   "+e2.emp_id);
	}
}