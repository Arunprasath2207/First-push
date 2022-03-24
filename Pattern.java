import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("0");
        a.add("1");
       // System.out.print(a.size());
        
       while(n>1)
        {
            for(int i=0;i<a.size();i++)
            {
                b.add("0"+a.get(i));
            }
            for(int j=0;j<a.size();j++)
            {
                b.add("1"+a.get(j));
            }
            a.clear();
            a.addAll(b);
            b.clear();
            n--;
        }
        for(int i=0;i<a.size();i++)
        {
            System.out.println(a.get(i));
        }
    }
}