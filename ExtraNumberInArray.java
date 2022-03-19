import java.util.*;
public class ExtraNumberInArray
{
   public static void main(String[] args)
{
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of numbers in the first and second array");
      int n,m;
      n = scan.nextInt();
      m = scan.nextInt();
      int[] a = new int[n];
      int[] b = new int[m];
      int flag=0;
      System.out.println("Enter the element for array 1");
      for(int i=0;i<n;i++)
      {
        a[i] = scan.nextInt();
      }
      System.out.println("Enter the element for second array");
      for(int i=0;i<m;i++)
      {
        b[i] = scan.nextInt();
      }
      for(int k=0;k<n;k++)
      {
        int q;
        q=a[k];
        flag = 0;
        for(int l=0;l<m;l++) 
           {
               if(q == b[l])
               {
                flag = flag+1; 
               } 
           }
           if(flag == 0)
               {
                 System.out.format("%d is the additional element found in the array 1 at the index %d",a[k],(k+1));
                 break;
               }
      }
}
}