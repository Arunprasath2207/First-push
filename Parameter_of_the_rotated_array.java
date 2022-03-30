import java.util.*;
public class Parameter_of_the_rotated_array 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the No.");
        int flag=1;
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(a[i+1]>a[i])
            {
                 flag=flag+1;
            }
            else
            {
               System.out.println(flag);
               break;
            }
        }
    }    
}
