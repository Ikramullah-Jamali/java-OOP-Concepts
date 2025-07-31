

class TestSuper   /* super keyword  */
{
    void show()
 {
    System.out.println("1");
 }
}
 class OverridingWithSuperKeyword extends TestSuper
{
   void show()
 {
   super.show();
   System.out.println("2");
 }
   public static void main(String [] args)
 {
   OverridingWithSuperKeyword o=new OverridingWithSuperKeyword();
   o.show();
 }
}