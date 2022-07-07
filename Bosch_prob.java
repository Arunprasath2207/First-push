import java.util.*;
public class Bosch_prob
{
    static int check_large(int[] a)
    {
        int j=a[0];
        int t=0;
        for(int i=1;i<a.length;i++)
        {
           if(j<a[i])
           {
            j=a[i];
            t=i;
           }
        }
        return t;
    }
    static boolean check_Zero(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of employee in the team");
        int num = scan.nextInt();
        int answer =0;
        int[] emp_error = new int[num];
        System.out.println("Enter the errors of the employees");
        for(int i=0;i<num;i++)
        {
            emp_error[i]=scan.nextInt();
        }
        System.out.println("Enter the error reduction for the project doer");
        int d_error = scan.nextInt();
        System.out.println("Enter the error reduction for the team members");
        int t_error = scan.nextInt();
        while(check_Zero(emp_error))
        {
            int great = check_large(emp_error);
            for(int i=0;i<emp_error.length;i++)
            {
                if(i==great)
                  emp_error[i]-=d_error;
                else
                  emp_error[i]-=t_error;
            }
            answer+=1;
        }
        System.out.println("The minimum project that the team must do to reduce the error is "+answer);
    }
}