import java.util.*;
public class Extra_paranthesis 
{
    public static int count(String str)
    {
        int n=0;
        for(int i=0;i<str.length();i++)
        {
             if(str.charAt(i)=='(' && str.charAt(i+4)==')' && str.charAt(i+1)>='a' && str.charAt(i+1)<='z')
             {
                 n++;
             }
        }
        return n;
    }
    public static void print(int i,String str)
    {
        for(int j=i;j<=i+4;j++)
        {
           System.out.print(str.charAt(j));
        }
    }
    public static void main(String[] args)
     {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the paranthesis");
        String str;
        str = scan.nextLine();
        int n = count(str);
        if(n>1)
        {
            System.out.print("(");
            for(int i=1;i<str.length();i++)
            {
                 if(str.charAt(i)=='(' && str.charAt(i+1)>='a' && str.charAt(i+1)<='z')
                 {
                    print(i,str);
                    n--;
                 }
                 if(n==0)
                  break;
            }
            System.out.print(")");
        }
        else
        {
            for(int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='(' && str.charAt(i+1)>='a' && str.charAt(i+1)<='z')
                print(i,str);
            }
        }
    }
}