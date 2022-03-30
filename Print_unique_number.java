import java.util.*;
public class Print_unique_number 
{
    public static boolean unique(int a)
    {
        int rem;
        rem = a%10;
        a = a/10;
        if(a==rem)
          return false;
        return true;
    }
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int start = scan.nextInt();
         int end = scan.nextInt();
         for(int i=start;i<=end;i++)
         {
            if(unique(i))
            {
                System.out.println(i);
            }
         }
     }    
}
