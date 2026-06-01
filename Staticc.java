class Demoo
{
    
    public String name;
    static int roll;
    public void show(String name , int roll)
    {
        System.out.println("Name: " + name  + "  " + "Roll: " + roll);
    }
public static void show1()
{
    System.out.println("Roll: " + roll);
}
}
public class Staticc
{
 public static void main(String[] args) 
 {
     Demoo obj = new Demoo();
     obj.name="hh";
     obj.show("hello", 0);
     Demoo.roll=23;
     Demoo.show1();
     
 }
}
