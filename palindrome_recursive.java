import java.util.*;
class palindrome_recursive
{
    public static boolean check(String str,int l,int h)
    {
        while(l<h)
        {
            if(str.charAt(l)==str.charAt(h))
            {
               l++;
               h--;
            }
            else
              return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string to check if it is a palindrome");
        String str = scan.nextLine();
        int l=0;
        int h=str.length()-1;
        while(l<h)
        {
            if(str.charAt(l)!=str.charAt(h) && (l+1)==h)
            {
                l++;
                h=str.length()-1;
            }
            else if(str.charAt(l)==str.charAt(h))
            {
                if(check(str,l,h))
                {
                    System.out.println("Yes");
                    System.out.println(str.substring(l, h+1));
                    break;

                }
                else
                {
                    l++;
                    h=str.length()-1;
                }
            }
            else
            {
                h--;
            }
        }
    }
}