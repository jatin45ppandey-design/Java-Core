import java.util.Scanner;

public class Calculatorr
{
  static double add (double a,double b)
  {
   return a+b;
  }
  static double subs(double a, double b )
  {
    return a-b;
  }
  static double multi(double a , double b)
  {
    return a*b;
  }
  static double divd(double a , double b)
  {
     return a/b;
    
  }


  public static void main ( String args[])
  {
      try (Scanner input = new Scanner(System.in))
    {
      System.out.print("INPUT a : ");
      double a= input.nextDouble();
      System.out.print("INPUT b : ");
      double b= input.nextDouble();
      System.out.print("Enter an operator (+, -, *, /): ");
           
      char operator = input.next().charAt(0);
      if (operator =='/' && b==0)
      {
        System.out.println("Error");
      }
      
      double result = switch (operator)
      {
        case '+' -> add(a, b);
        case '-' -> subs(a, b);
        case '*' -> multi(a, b);
        case '/' -> divd(a, b);
        default  -> 
          {
            System.out.println("Invalid operator!");
            yield 0;
          } 
        
      } ;
          
       System.out.println("Result: " + result);
    
    }
  } 
}        
