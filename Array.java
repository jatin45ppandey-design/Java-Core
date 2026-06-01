public class Array
{
    public static void main(String[] args)
    {
        int arr[] = new int [2];
        arr[0]= 1;
        arr[1]=2;
        System.out.print( "Array: ");
        System.out.print("{");
        for (int i=0;i<2;i++)
       {
        System.out.print(arr[i] ); 
        if (i==1)
        {
        System.out.print("}");
        }
        else 
        {
             System.out.print(",");
        }
       }
    }
}
