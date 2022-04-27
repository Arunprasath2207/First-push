import java.util.*;
public class odd_even
 {
     public static boolean findd(int n)
     {
         if(n%4!=0)
            return false;
        else
            return true;
     }
     public static int[] find(int n)
     {
        int i=0;
        int j=2;
        int o=1;
        int sum=0;
        int[] a = new int[n];
        for(int f=0;f<n;f++)
        {
            if(f<n/2)
            {
                a[f]=j;
                j=j+2;
                sum=sum+a[f];
            }
            else
            {
                if(f==a.length-1)
                 {
                   a[f]=sum;
                   break;
                 }
                a[f]=o;
                sum=sum-o;
                o=o+2;
            }
        }
        return a;
     }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int t= scan.nextInt();
        for(int k=0;k<t;k++)
        {
            int n=scan.nextInt();
            if(findd(n))
            {
                int[] a=find(n);
                System.out.println("YES");
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i]+" ");
                }
            }
            else
             System.out.println("No");
        }
    }
}