import java.util.*;
public class Word_Pattern
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s ;
        System.out.println("Entert an odd letter word");
        s=scan.nextLine();
        int len = s.length();
        if(len%2 != 0)
        {
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                if(i==j)
                {
                    System.out.print(s.charAt(i));
                }
                else if((i+j)==len-1)
                {
                    System.out.print(s.charAt(j));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       }
       else
       {
             System.out.println("Enter the name with odd letters");
       }

    }
}