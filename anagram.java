import java.util.*;
public class anagram
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
        String b;
        System.out.println("Enter the two strings");
        a=scan.nextLine();
        b=scan.nextLine();
        if(a.length()!=b.length())
        {
            System.out.println("Not Anagram");
        }
        else
        {
            char[] array1 = a.toLowerCase().toCharArray();
            char[] array2 = b.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);
            if(Arrays.equals(array1, array2))
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }
    }
}