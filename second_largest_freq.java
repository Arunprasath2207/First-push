import java.util.*;
public class second_largest_freq
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values");
        n=scan.nextInt();
        int[] array = new int[n];
        int[] fr = new int[n];
        int[] a = new int[2];
        int second=0;
        System.out.println("Enter the number of arrays");
        for(int i=0;i<n;i++)
        {
            array[i]=scan.nextInt();
        }
        int visited=-1;
        for(int i=0;i<array.length;i++)
        {
            int count=1;
            for(int j=i+1;j<array.length;j++)
            {
                if(array[i]==array[j])
                {
                    count++;
                    fr[j]=visited;
                }
            }
            if(fr[i]!=visited)
            {
                if(count>a[0])
                {
                    a[0]=count;
                }
                else if(count<a[0] && count>a[1])
                {
                    a[1]=count;
                    second=array[i];
                }
            }
        }
        System.out.println("The second Largest number is "+second);
        
    }
}