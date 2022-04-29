import java.util.*;
public class Star_star
{
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         System.out.println("Enter the number");
         int n=scan.nextInt();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<(2*n)+1;j++)
             {
                 if(j<(2*n)/2)
                 {
                     if(j<i)
                      System.out.print(" ");
                     else
                      System.out.print("*");
                 }
                 else if(j==(2*n)/2)
                 {
                     System.out.print(" ");
                 }
                 else
                 {
                     if(j<(2*n)-i+1)
                      System.out.print("*");
                 }
             }
             System.out.println();
         }
     }    
}
