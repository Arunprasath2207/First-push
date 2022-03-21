import java.util.Scanner;
import java.math.*;
class fibanocci_or_not
{
    public static void main(String[] args)
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the no. of and  numbers to find whether it is fibanocci or not");
      int n = scan.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++)
      {
          arr[i] = scan.nextInt();
      }
      for(int i=0;i<n;i++)
      {
          //Check if the condition of either one is satisfied or not
          if((p1(arr[i]))|(p2(arr[i])))
          {
              System.out.println(arr[i]);
          }
      }
    }
    //This function is to check whether the result of (5*n^2)+4 is perfect square or not
    static boolean p1(int n)
    {
         int k;
         k=5*(n*n)+4;
         int s =(int)Math.sqrt(k);
         if((s*s)==k)
           return true;
        return false;
    }
     //This function is to check whether the result of (5*n^2)-4 is perfect square or not
    static boolean p2(int n)
    {
        int k;
         k=5*(n*n)-4;
         int s =(int)Math.sqrt(k);
         if((s*s)==k)
           return true;
        return false;
    }
}