
class A
{
 void show()
    {
      System.out.println("In A");
    }
}
class B extends A
{
    @Override
    public void show()
    {
      System.out.println("In B");
    }
}
class C extends A
{
   @Override
   public void show()
    {
      System.out.println("In C");
    }
}


public class Inheritance
{
   public static void main(String[] args) 
   {
       A obj = new A();
       obj.show();
       obj = new B();
       obj.show();
       obj = new C();
       obj.show();
   } 
}
