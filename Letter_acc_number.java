import java.util.*;
public class Letter_acc_number 
{
    public static void print(char c,int n)
    {
          for(int i =0;i<n;i++)
          {
              System.out.print(c);
          }
    }
   public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String str;
        str = scan.nextLine();
        int len = str.length();
        char[] ch = str.toCharArray();
        for(int i=0;i<len-1;i+=2)
        {
            if(i==len-2)
            {
                print(ch[i],ch[i+1]-'0');
            }
            else if((ch[i+1]>='0' && ch[i+1]<='9') && (ch[i+2]>='a' && ch[i+2]<='z'))
            {
                 print(ch[i],ch[i+1]-'0');
            }
            else
            {
                int count=ch[i+1]-'0';
                int a = ch[i+2]-'0';
                int num = (count*10) + a;
                print(ch[i],num);
                i=i+1;
            }
        }
    }
}