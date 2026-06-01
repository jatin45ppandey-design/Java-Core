import java.util.Scanner;
class Demo
{
    private String name ;
    private int age ;

    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public void setName(String n)
    {  
        name = n;
    }
    public void setAge(int a)
    {
        age= a;
    }

}
 public class Encapsulations 
 {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);

      System.out.print("Age : ");
     int myage = input.nextInt();

     input.nextLine();

      System.out.print("Name : ");
      String myname = input.nextLine();
  
      Demo obj = new Demo();

      obj.setName(myname);
      System.out.println(obj.getName());

      obj.setAge(myage);
      System.out.println(obj.getAge());

      input.close();

   }
  

 }

