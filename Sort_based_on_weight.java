import java.util.*;
public class Sort_based_on_weight 
{
    static boolean perfect(int num)
    {
        int sum=0;
        for(int i =1;i<num;i++)
        {
             if(num%i==0)
             {
                sum+=i;
             }
        }
        if(sum==num)
        {
             return true;
        }
        else
        {
          return false;
        }
    }
    static boolean multiple_4(int num)
    {
        if((num%4==0) && (num%6==0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean even(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the N of number:-");
        int weight=0;
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i =0;i<n;i++)
        {
            weight=0;
            if(perfect(a[i]))
            {
               weight+=5;
            }
            if(multiple_4(a[i]))
            {
                weight+=4;
            }
            if(even(a[i]))
            {
                weight+=3;
            }
            b[i]=weight;
        }
        int swap;
        for(int i =0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(b[i]>b[j])
                {
                      swap = b[i];
                      b[i]=b[j];
                      b[j]=swap;
                      swap=a[i];
                      a[i]=a[j];
                      a[j]=swap;
                }
            }
        }
        for(int i =0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }    
}
