import java.util.*;
public class stack 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Stack stk = new Stack();
        int con=1;
        do
        {
        System.out.println("1.push 2.pop 3.peek 4.print");
        int choice = scan.nextInt();
        scan.nextLine();
        switch(choice)
        {
            case 1:
               System.out.println("Enter the element to push into the stack");
               String a = scan.nextLine();
               stk.push(a);
               break;
            case 2:
               System.out.println("The poped element is "+stk.pop());
               break;
            case 3:
               System.out.println("The top element is "+stk.peek());
               break;
            case 4:
               System.out.println("The stack elements are"+stk);
               break;
            default:
               System.out.println("Enter the correct choice");
         }
         System.out.println("Enter 1 to continue or others");
            con = scan.nextInt();
       }while(con==1);
    }
}