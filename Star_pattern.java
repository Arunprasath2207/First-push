import java.util.*;
public class Star_pattern 
{
   public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       int m,n;
       System.out.println("Enter the Number of rows");
       m=scan.nextInt();
       int count=0,flag=0;
       System.out.println("Enter the Number of column");
       n=scan.nextInt();
       for(int i =0;i<m;i++)
       {
           if(i%2!=0)
            count++;
           for(int j=0;j<n;j++)
           {
              if(i%2==0)
                System.out.print("#");
              else if(count%2!=0)
              {
                  if(j==0)
                  {
                      System.out.print("#");
                  }
              }
              else if(count%2==0)
              {
                  if(j==n-1)
                  {
                      System.out.print("#");
                  }
                  else
                  {
                       System.out.print(" ");
                  }
              }
           }
           System.out.println();
       }
   }    
}
