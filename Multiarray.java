public class Multiarray 
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[2][2];
        for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j <2; j++) 
            {
                arr[i][j]=(int) (Math.random()*10);
            }
        }
         for (int i = 0; i < 2; i++) 
        {
            for (int j = 0; j < 2; j++) 
            {
                System.out.print(arr[i][j] + "  ");
            }
            System.err.println();
        }
      for (int n[] : arr)
      {
        for (int m : n)
        {
            System.err.print(m + " ");
        }
        System.err.println();
      }

    }
}
