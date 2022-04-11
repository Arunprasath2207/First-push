import java.util.*;
public class paranthesis
{
    public static boolean par(String str)
    {
       char ch,c;
       Stack s = new Stack();
       for(int i=0;i<str.length();i++)
       {
          if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[')
          {
              s.push(str.charAt(i));
          }
          else
          {
              ch = str.charAt(i);
              switch(ch)
              {
                  case ')':
                    {
                      c=(char) s.peek();
                      if(c!='(')
                         return false;
                      break;  
                    }
                    case '}':
                    {
                        c=(char)s.peek();
                        if(c!='{')
                        {
                            return false;
                        }
                        break;
                    }
                    case ']':
                    {
                        c=(char)s.peek();
                        if(c!='[')
                        {
                            return false;
                        }
                        break;
                    }

              }
          }
       }
       return true;
    }
       public static void main(String[] args)
       {
        Scanner scan = new Scanner(System.in);
        String str = new String();
        System.out.println("Enter the paranthesis");
        str = scan.nextLine();
        if(!(par(str)))
        {
            System.out.println("Not Balanced");
        }
        else
        {
            System.out.println("Balanced");
        }
       }
}