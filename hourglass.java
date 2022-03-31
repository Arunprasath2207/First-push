import java.util.*;
class hourglass
{
    public static void main(String[] args)
    {
        int sum = 0;
        int result =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements of array");
        int n = scan.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        for(int i =0;i<n-2;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                sum = (a[i][j]+a[i][j+1]+a[i][j+2])+
                      (a[i+1][j+1])+
                      (a[i+2][j]+a[i+2][j+1]+a[i+2][j+2]);
                if(sum>result)
                {
                    result=sum;
                }
            }
        }
        System.out.println(result);
    }
}