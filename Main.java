// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scan.nextInt();
        int k;
        k=n+(n+1);
        int f=k;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<k;j++)
            {
                if(j==(f/2) || j<i || j>(k-1)-i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            
          System.out.println();
        }
}
}