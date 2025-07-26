

class  Animal
{
  	void eat() 
    {
        System.out.println("Dog is Eating.");
    }
}
class SingleInheritanceExample extends  Animal
{
	  public static void main(String [] args)
	  {
	      Animal a=new Animal();
        a.eat();
  	}
}
