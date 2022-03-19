import java.util.*;
public class sort_by_freq
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of values");
        n=scan.nextInt();
        int[] array = new int[n];
        int[] fr = new int[n];
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
                fr[i]=count;
            }
        }
        int swap;
        for(int i=0;i<array.length;i++)
        {
            for(int j=i+1;j<array.length;j++)
            {
                if(fr[i]<fr[j])
                {
                   swap=fr[i];
                   fr[i]=fr[j];
                   fr[j]=swap;
                   swap=array[i];
                   array[i]=array[j];
                   array[j]=swap;
                }
            }
        }
        int no;
        for(int i=0;i<array.length;i++)
        {
            no=fr[i];
            if(no==-1)
            {
                break;
            }
            while(no>0)
            {
                System.out.print(array[i]);
                no--;
            }
        }
    }
}