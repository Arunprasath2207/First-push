import java.util.*;
public class alternative_sort
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N");
        int n = scan.nextInt();
        int[] a = new int[n];
        int swap;
        for(int i =0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    swap=a[i];
                    a[i]=a[j];
                    a[j]=swap;
                }
            }
        }
        int c=0;
        n=n-1;
        do
        {
           if(c==n)
           {
               System.out.print(a[c]);
               break;
           }
           System.out.print(a[c]);
           System.out.print(a[n]);
           n--;
           c++;
        }while(c<=n);
    }
}