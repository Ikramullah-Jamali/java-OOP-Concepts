

abstract class Vehicle
{
    abstract void start();
}
 class Car extends Vehicle
{
    void start ()
  {
    System.out.println("Car is start with key");
  }
}
 class AbstractionWithAbstractClass extends Vehicle
{
    void start()
  {
    System.out.println("Scotter start with kick");
  }
  public static void main(String [] args)
  {
    Car c=new Car();
    c.start();
	AbstractionWithAbstractClass a=new AbstractionWithAbstractClass();
	a.start();
  }
} 