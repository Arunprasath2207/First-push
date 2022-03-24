import java.util.*;
public class Reverse_rotation 
{
    static void rotate(int arr[],int d,int n)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    static void reverse(int arr[],int start,int last)
    {
        int tmp;
        while(start<last)
        {
            tmp=arr[start];
            arr[start]=arr[last];
            arr[last]=tmp;
            start++;
            last--;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = scan.nextInt();
        System.out.format("Enter the %d number of inputs to the array",n);
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
             arr[i] = scan.nextInt();
        }
        System.out.println("Enter the set of numbers to implement");
        int d = scan.nextInt();
        if(d<n)
           rotate(arr,d,n);
        else
           System.out.println("Enter a valid number");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
