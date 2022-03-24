import java.util.*;
public class Insert_0_after_k_times 
{
    public static void main(String[] args)
    {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number of bits: ");
         int n = scan.nextInt();
         int[] a = new int[100];
         for(int j=0;j<n;j++)
         {
            a[j] = scan.nextInt();
         }
         System.out.println("enter the parameter");
         int k = scan.nextInt();
         int count=0;
         for(int i=0;i<n;i++)
         {
             if(a[i]==1)
             {
                 count++;
             }
             else
             {
                 count=0;
             }
             if(count==k)
             {
                 for(int t=n-1;t>i;t--)
                 {
                     a[t+1]=a[t];
                 }
                 a[i+1]=0;
                 n=n+1;
             }
         }
         for(int i=0;i<n;i++)
         {
             System.out.print(a[i]);
         }
    }
}
